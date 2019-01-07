package com.renting.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.renting.vo.Hos_house;

public interface Hos_houseMapper {
	/**
	 * ��ҳ���������ϲ�ѯ
	 * @param map ����
	 * @return ���ݼ���
	 */
	public Page<Hos_house> seleUnite(Map<String, Object> map);
	/**
	 * �����ݱ�Ų�ѯĳ������
	 * @param hid
	 * @return ���ݶ���
	 */
	public Hos_house seleHouseId(@Param("hMid")int hMid);
	
	/**
	 * ��ӷ���
	 * @param house ���ݶ���
	 * @return ִ�н��
	 */
	public int addHouse(Hos_house house);
	
	/**
	 * ɾ������
	 * @param hMid ����id
	 * @return ִ�н��
	 */
	public int deleHouse(@Param("hMid")int hMid);
	
	/**
	 * �޸ķ���
	 * @param house ���ݶ���
	 * @return ִ�н��
	 */
	public int updaHouse(Hos_house house);
}
