package com.renting.service;

import java.util.List;

import com.renting.vo.Hos_type;

public interface Hos_typeService {
	/**
	 * 获取房屋类型
	 * @return 房屋类型
	 */
	List<Hos_type>  seleTypeAll();
}
