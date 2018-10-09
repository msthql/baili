package com.asiainfo.abdinfo.service;

import java.util.List;
import java.util.Map;

import com.asiainfo.abdinfo.po.Announcement;
import com.asiainfo.abdinfo.po.ReadClock;

public interface ReadClockService {
	
	Map getReadIndex(String staffCode,String clockDate);
	
	void updateBook(Map map);
	
	List<ReadClock> getReadIndex1(Map map);
	
	List<Announcement> getAnnount();
	


}
