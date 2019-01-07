package com.renting.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.renting.vo.Hos_street;

public interface Hos_streetService {
	/**
	 * 获取街道
	 * @return 街道
	 */
	List<Hos_street> seleStreetId(@Param("sdid")Integer sdid);
}
