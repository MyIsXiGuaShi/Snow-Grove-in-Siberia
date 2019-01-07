package com.renting.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.renting.service.Hos_districtService;

@Controller
/**
 * ¿ØÖÆÆ÷Àà
 * @author À¶Ìì
 *
 */
public class DistrictController {
	
	@Resource
	private Hos_districtService districtService;
	
	@RequestMapping(value="/ajaxDistrict",method=RequestMethod.POST)
	public void ajaxDistrict(HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(JSON.toJSON(districtService.seleDistrictAll()));
		out.flush();
		out.close();
 	}
}
