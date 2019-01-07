package com.renting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.renting.service.Hos_streetService;

@Controller
public class StreetController {
	@Resource
	private Hos_streetService streetService;
	
	@RequestMapping(value="/ajaxStreet",method=RequestMethod.POST)
	public void ajaxStreet(Integer sdid,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(JSON.toJSON(streetService.seleStreetId(sdid)));
		out.flush();
		out.close();
	}
}
