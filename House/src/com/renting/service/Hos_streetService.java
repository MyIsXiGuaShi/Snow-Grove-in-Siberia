package com.renting.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.renting.vo.Hos_street;

public interface Hos_streetService {
	/**
	 * ��ȡ�ֵ�
	 * @return �ֵ�
	 */
	List<Hos_street> seleStreetId(@Param("sdid")Integer sdid);
}
