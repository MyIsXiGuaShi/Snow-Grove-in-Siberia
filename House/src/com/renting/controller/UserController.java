package com.renting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.renting.service.Sys_userService;
import com.renting.vo.Sys_user;

@Controller
@SessionAttributes("message")
public class UserController {
	
	@Resource
	private Sys_userService userService;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(Sys_user user,HttpSession session,Model model){
		int uid = userService.login(user);
		if(uid>0){
			user.setUid(uid);
			session.setAttribute("user", user);
			return "forward:index";
		}else{
			model.addAttribute("message","µÇÂ½Ê§°Ü!");
			return "redirect:login";
		}
	}
	@RequestMapping(value="/ajaxName",method=RequestMethod.POST)
	public void ajaxName(String uName,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(userService.nameVerify(uName));
		out.flush();
		out.close();
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(Sys_user user,Model model){
		int result = userService.register(user);
		String message = null;
		if(result>0){
			message = "×¢²á³É¹¦£¡";
		}else{
			message = "×¢²áÊ§°Ü£¡";
		}
		model.addAttribute("message",message);
		return "redirect:page/login.jsp";
	}
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.setAttribute("user", null);
		return "redirect:page/login.jsp";
	}
}
