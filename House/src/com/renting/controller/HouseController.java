package com.renting.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.renting.service.Hos_houseService;
import com.renting.vo.Hos_house;
import com.renting.vo.Sys_user;

@Controller
@SessionAttributes({"page","house","map"})
public class HouseController {
	private Map<String, Object> maps = new HashMap<String, Object>();
	
	private HouseController() {
		maps.put("pageSize",3);
		maps.put("area",0);
		maps.put("priceStr",0);
		maps.put("district",0); 
		maps.put("type",0); 
		maps.put("street",0); 
	}
	
	@Resource
	private Hos_houseService houseService;
	
	@RequestMapping("/index")
	public String guanli(HttpSession session,Model model){
		Sys_user user =(Sys_user) session.getAttribute("user");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageNum", 0);
		map.put("pageSize",3);
		map.put("uid", user.getUid());
		Page<Hos_house> page = houseService.seleUnite(map);
		model.addAttribute("page",page);
		return "redirect:page/guanli.jsp";
	}
	@RequestMapping("/glPage")
	public String glPage(@RequestParam Map<String, Object> map,Model model){
		map.put("pageSize",3);
		model.addAttribute("page",houseService.seleUnite(map));
		return "redirect:page/guanli.jsp";
	}
	@RequestMapping("/findHouse")
	public String findHouse(Integer hMid,Model model){
		Hos_house house = houseService.seleHouseId(hMid);
		model.addAttribute("house",house);
		return "redirect:page/details.jsp";
	}
	@RequestMapping("/list")
	public String list(Model model){
		maps.put("pageNum", 0);
		Page<Hos_house> page = houseService.seleUnite(maps);
		model.addAttribute("page",page);
		model.addAttribute("map",maps);
		return "redirect:page/list.jsp";
	}
	@RequestMapping(value="/condition",method=RequestMethod.POST)
	public String condition(@RequestParam Map<String, Object> map,Model model){
		maps = map;
		maps.put("pageNum", 0);
		maps.put("pageSize",3);
		String area = (String) map.get("area");
		int areaA =0,areaB = 0;
		if(area.length()>2){
			String[] areaArray = area.split("-");
			areaA = Integer.parseInt(areaArray[0]);
			areaB = Integer.parseInt(areaArray[1]);
		}
		maps.put("areaA", areaA);
		maps.put("areaB", areaB);
		String price = (String) map.get("priceStr");
		int priceA =0,priceB = 0;
		if(price.length()>2){
			String[] priceArray = price.split("-");
			priceA = Integer.parseInt(priceArray[0]);
			priceB = Integer.parseInt(priceArray[1]);
		}
		maps.put("priceA", priceA);
		maps.put("priceB", priceB);
		Page<Hos_house> page = houseService.seleUnite(maps);
		model.addAttribute("page",page);
		model.addAttribute("map",maps);
		return "redirect:page/list.jsp";
	}
	@RequestMapping("/page")
	public String page(String pageNum,Model model){
		maps.put("pageNum", pageNum);
		Page<Hos_house> page = houseService.seleUnite(maps);
		model.addAttribute("page",page);
		model.addAttribute("map",maps);
		return "redirect:page/list.jsp";
	}
	@RequestMapping(value="/addHouse",method=RequestMethod.POST)
	public String addHouse(Hos_house house,HttpSession session){
		Sys_user user = (Sys_user) session.getAttribute("user");
		String message = null;
		if(houseService.addHouse(house)>0){
			message = "发布成功！";
			session.setAttribute("message",message);
			session.setAttribute("user",user);
			return "forward:index";
		}else{
			message = "发布失败！";
			session.setAttribute("message", message);
			return "redirect:page/fabu.jsp";
		}
	}
	@RequestMapping("/deleHouse")
	public String deleHouse(int hMid,HttpSession session){
		String message = null;
		if(houseService.deleHouse(hMid)>0){
			message = "删除成功！";
		}else{
			message = "删除失败！";
		}
		session.setAttribute("message",message);
		return "forward:index";
	}
	@RequestMapping("/transferId")
	public String transferId(int hMid,Model model){
		Hos_house house = houseService.seleHouseId(hMid);
		model.addAttribute("house",house);
		return "redirect:page/upda.jsp";
	}
	
	@RequestMapping(value="/updaHouse",method=RequestMethod.POST)
	public String updaHouse(Hos_house house,HttpSession session){
		String message = null;
		if(houseService.updaHouse(house)>0){
			message = "修改成功！";
			session.setAttribute("message", message);
			return "forward:index";
		}else{
			message = "修改失败！";
			session.setAttribute("message", message);
			return "redirect:page/upda.jsp";
		}
	}
}
