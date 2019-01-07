package com.renting.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renting.dao.Hos_typeMapper;
import com.renting.service.Hos_typeService;
import com.renting.vo.Hos_type;

@Service("typeService")
@Transactional
public class Hos_typeServiceImpl implements Hos_typeService {
	
	@Autowired
	private Hos_typeMapper typeMap;
	
	@Override
	@Transactional(readOnly=true)
	public List<Hos_type> seleTypeAll() {
		return typeMap.seleTypeAll();
	}
}
