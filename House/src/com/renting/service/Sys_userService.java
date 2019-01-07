package com.renting.service;

import org.apache.ibatis.annotations.Param;

import com.renting.vo.Sys_user;

public interface Sys_userService {
	/**
	 * �û���¼
	 * @param user �û�
	 * @return ִ�н��
	 */
	public int login(Sys_user user);
	/**
	 * �û�ע��
	 * @param user �û�
	 * @return ִ�н��
	 */
	int register(Sys_user user);
	/**
	 * �û�����֤
	 * @param uName �û���
	 * @return ִ�н��
	 */
	boolean nameVerify(@Param("uName")String uName);
}
