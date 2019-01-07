package com.renting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renting.dao.Hos_districtMapper;
import com.renting.service.Hos_districtService;
import com.renting.vo.Hos_district;
@Service("districtService")
@Transactional
public class Hos_districtServiceImpl implements Hos_districtService {
	@Autowired
	private Hos_districtMapper districtMap;
	@Override
	@Transactional(readOnly=true)
	public List<Hos_district> seleDistrictAll() {
		return districtMap.seleDistrictAll();
	}
}
