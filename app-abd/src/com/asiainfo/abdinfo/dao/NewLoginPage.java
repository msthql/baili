package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;

public interface NewLoginPage {
	
	/*插入用户信息*/
	void insertUser(Map map);
	
	/**
	 * 查询用户
	 * @param map
	 * @return
	 */
	public NewLogin findUser(Map map);
	
	/**
	 * 注册 即更新
	 * @param map
	 */
	void updateUser(Map map);
	
	/*
	 * 查询用户新
	 */
	NewLogin findNewUser(@Param(value="openId") String openId);
	
	/**
	 * 用于展示用户的感想
	 */
	List<ListAllFeeling> findAllFeeling(@Param(value="staffCode") String staffCode);

}





