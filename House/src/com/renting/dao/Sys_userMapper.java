package com.renting.dao;


import com.renting.vo.Sys_user;

public interface Sys_userMapper {
	/**
	 * �û���¼
	 * @param user �û�
	 * @return ִ�н��
	 */
	Integer login(Sys_user user);
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
	int nameVerify(String uName);
}
