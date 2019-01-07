package com.renting.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 出租房屋信息表
 * @author 蓝天
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hos_house implements Serializable {
	
	private static final long serialVersionUID = -6959355900105713977L;
	//出租房屋编号
	private int hMid;
	//客户编号
	private int uid;
	//街道编号
	private int sid;
	//房屋类型编号
	private int hTid;
	//房屋面积
	private int size;
	//每月租金
	private double price;
	//标题
	private String topic;
	//描述
	private String contents;
	//发布时间
	private Date hTime;
	//备注
	private String copy;
	
	private Sys_user user;
	private Hos_type type;
	private Hos_street street;
}
