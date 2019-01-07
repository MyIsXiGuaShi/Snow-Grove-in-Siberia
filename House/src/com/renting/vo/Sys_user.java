package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * �ͻ���Ϣ��
 * @author ����
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sys_user implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8931119034094488517L;
	//�ͻ����
	private Integer uid;
	//�ͻ�����
	private String uName;
	//�ͻ�����
	private String uPassWord;
	//�ͻ��绰
	private String uPhone;
	//�ͻ���ʵ����
	private String realName;
	public Sys_user(String uName, String uPassWord, String uPhone, String realName) {
		this.uName = uName;
		this.uPassWord = uPassWord;
		this.uPhone = uPhone;
		this.realName = realName;
	}
}
