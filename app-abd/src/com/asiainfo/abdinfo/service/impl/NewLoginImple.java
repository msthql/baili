package com.asiainfo.abdinfo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.NewLoginPage;
import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;
import com.asiainfo.abdinfo.service.NewLoginService;



@Service(value="NewLoginService")
public class NewLoginImple implements NewLoginService{
	
	@Autowired
	private NewLoginPage newLoginPage;

	@Override
	public void insertUser(Map map) {
		newLoginPage.insertUser(map);
		
	}

	@Override
	public NewLogin getUser(Map map) {
		return newLoginPage.findUser(map);
	}

	@Override
	public void regUser(String userId, String password, String openId) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("openId", openId);
		if(getUser(map)!=null){
			map.put("userId", userId);
			map.put("password", password);
			newLoginPage.updateUser(map);
			System.out.println("注册成功");
			
		}
	}

	@Override
	public NewLogin getNewUser(String openId) {		
		return newLoginPage.findNewUser(openId);
	}
   
	
	/**
	 * 显示用户的所有感想
	 */
	@Override
	public List<ListAllFeeling> getAllFeeling() {		
		return newLoginPage.findAllFeeling();
	}
}










