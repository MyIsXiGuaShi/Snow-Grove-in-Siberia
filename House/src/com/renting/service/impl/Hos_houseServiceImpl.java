package com.renting.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.renting.dao.Hos_houseMapper;
import com.renting.service.Hos_houseService;
import com.renting.vo.Hos_house;

@Service("houseService")
@Transactional
public class Hos_houseServiceImpl implements Hos_houseService {
	@Autowired
	private Hos_houseMapper houseMap;
	@Override
	@Transactional(readOnly=true)
	public Page<Hos_house> seleUnite(Map<String, Object> map) {
		int pageNum = Integer.parseInt(map.get("pageNum").toString());
		int pageSize = Integer.parseInt(map.get("pageSize").toString());
		Page<Hos_house> page =PageHelper.startPage(pageNum,pageSize,true,true,true);
		houseMap.seleUnite(map);
		return page;
	}
	@Override
	@Transactional(readOnly=true)
	public Hos_house seleHouseId(int hMid) {
		return houseMap.seleHouseId(hMid);
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public int addHouse(Hos_house house) {
		int result = -1;
		try{
			result = houseMap.addHouse(house);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public int deleHouse(int hMid) {
		int result = -1;
		try{
			result = houseMap.deleHouse(hMid);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public int updaHouse(Hos_house house) {
		int result = -1;
		try{
			result = houseMap.updaHouse(house);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

}
