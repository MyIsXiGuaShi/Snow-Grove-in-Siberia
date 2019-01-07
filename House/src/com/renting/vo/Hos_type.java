package com.renting.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 房屋类型类
 * @author 蓝天
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hos_type implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6098622322523714912L;
	//房屋类型编号
	private int hid;
	//房屋类型名称
	private String htName;
}
