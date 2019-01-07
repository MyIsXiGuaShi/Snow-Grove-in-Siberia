package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 区县信息类
 * @author 蓝天
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hos_district implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8655448286036960999L;
	//区县编号
	private Integer did;
	//区县名称
	private String dName;
}
