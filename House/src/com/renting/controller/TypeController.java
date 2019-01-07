package com.renting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.renting.service.Hos_typeService;

@Controller
public class TypeController {
	@Resource
	private Hos_typeService typeService;
	
	@ResponseBody
	@RequestMapping(value="/ajaxTypes",method=RequestMethod.POST)
	public void ajaxTypes(HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(JSON.toJSON(typeService.seleTypeAll()));
		out.flush();
		out.close();
	}
}
