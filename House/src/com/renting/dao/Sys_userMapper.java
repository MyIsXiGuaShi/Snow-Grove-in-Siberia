package com.renting.dao;


import com.renting.vo.Sys_user;

public interface Sys_userMapper {
	/**
	 * 用户登录
	 * @param user 用户
	 * @return 执行结果
	 */
	Integer login(Sys_user user);
	/**
	 * 用户注册
	 * @param user 用户
	 * @return 执行结果
	 */
	int register(Sys_user user);
	
	/**
	 * 用户名验证
	 * @param uName 用户名
	 * @return 执行结果
	 */
	int nameVerify(String uName);
}
