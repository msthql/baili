package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.User;

public interface ITipsDao {
	
	public int addTipsDailyfeeling(Map<String, Object> map);
	public int addTipsOwes_content(Map<String, Object> map);
	public List<User> findTips(Map<String, Object> map);
	public int updateTipsDailyfeeling(Map<String, Object> map);
	public int updateTipsOwes_content(Map<String, Object> map);

}
