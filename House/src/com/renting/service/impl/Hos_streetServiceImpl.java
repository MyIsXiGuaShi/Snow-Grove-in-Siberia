package com.renting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renting.dao.Hos_streetMapper;
import com.renting.service.Hos_streetService;
import com.renting.vo.Hos_street;

@Service("streetService")
public class Hos_streetServiceImpl implements Hos_streetService {
	@Autowired
	private Hos_streetMapper streetMap;
	@Override
	public List<Hos_street> seleStreetId(Integer sdid) {
		return streetMap.seleStreetId(sdid);
	}

}
