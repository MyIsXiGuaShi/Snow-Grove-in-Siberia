package com.renting.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.renting.dao.Sys_userMapper;
import com.renting.service.Sys_userService;
import com.renting.vo.Sys_user;

@Service("userService")
@Transactional
public class Sys_userServiceImpl implements Sys_userService{
	
	@Autowired
	private Sys_userMapper userMap;
	
	@Override
	@Transactional(readOnly=true)
	public int login(Sys_user user) {
		int result = -1;
		try{
			Integer uid = userMap.login(user);
			if(uid != null){
				result = uid;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public int register(Sys_user user) {
		int result = -1;
		try{
			result = userMap.register(user);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	@Transactional(readOnly=true)
	public boolean nameVerify(String uName) {
		boolean result = false;
		if(userMap.nameVerify(uName)>0){
			result = true;
		}
		return result;
	}
}
