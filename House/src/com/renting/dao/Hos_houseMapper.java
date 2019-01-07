package com.renting.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.renting.vo.Hos_house;

public interface Hos_houseMapper {
	/**
	 * 分页，三表联合查询
	 * @param map 条件
	 * @return 房屋集合
	 */
	public Page<Hos_house> seleUnite(Map<String, Object> map);
	/**
	 * 按房屋编号查询某个房屋
	 * @param hid
	 * @return 房屋对象
	 */
	public Hos_house seleHouseId(@Param("hMid")int hMid);
	
	/**
	 * 添加房屋
	 * @param house 房屋对象
	 * @return 执行结果
	 */
	public int addHouse(Hos_house house);
	
	/**
	 * 删除房屋
	 * @param hMid 房屋id
	 * @return 执行结果
	 */
	public int deleHouse(@Param("hMid")int hMid);
	
	/**
	 * 修改房屋
	 * @param house 房屋对象
	 * @return 执行结果
	 */
	public int updaHouse(Hos_house house);
}
