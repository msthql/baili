package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.User;

public interface ITipsService {
	
	public int addTipsDailyfeeling(Map<String, Object> map);
	public int updateTipsDailyfeeling(Map<String, Object> map);
	public List<User> findTips(Map<String, Object> map);
}
