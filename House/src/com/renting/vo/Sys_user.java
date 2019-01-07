package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * 客户信息类
 * @author 蓝天
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
	//客户编号
	private Integer uid;
	//客户姓名
	private String uName;
	//客户密码
	private String uPassWord;
	//客户电话
	private String uPhone;
	//客户真实姓名
	private String realName;
	public Sys_user(String uName, String uPassWord, String uPhone, String realName) {
		this.uName = uName;
		this.uPassWord = uPassWord;
		this.uPhone = uPhone;
		this.realName = realName;
	}
}
