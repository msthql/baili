package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Announcement;
import com.asiainfo.abdinfo.po.ReadClock;
import com.asiainfo.abdinfo.po.ReadCount;

public interface ReadClockDao {
	
	/**
	 * 查询信息
	 * @param map
	 * @return
	 */
	List<ReadClock> findReadIndex(Map map);
	
	/**
	 * 各种统计
	 * @return
	 */
	ReadCount findCount(Map map);
	
	/*
	 * 判断有多少人上线 
	 */
	String findCountPeople(Map map);
	
	/**
	 * 插入数据即更新
	 * @param map
	 */
	void updateBook(Map map);
	
	
	List<Announcement> findAnnount();
	

	
	
}








