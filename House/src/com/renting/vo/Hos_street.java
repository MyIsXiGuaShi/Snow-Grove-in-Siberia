package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 街道信息类
 * @author 蓝天
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hos_street implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6894044725570311504L;
	//街道编号
	private Integer sid;
	//街道名称
	private String sName;
	//区县编号
	private Integer sDid;
	
	private Hos_district district;
}
