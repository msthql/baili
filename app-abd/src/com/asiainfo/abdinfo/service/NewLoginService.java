package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;

public interface NewLoginService {
	
	/*插入用户信息*/
	void insertUser(Map map);
	
	public NewLogin getUser(Map map);
	
	void regUser(String userId,String password,String openId);
	
	public NewLogin getNewUser(String openId);
	
	/**
	 * 用于展示用户的感想
	 */
	List<ListAllFeeling> getAllFeeling();

}
