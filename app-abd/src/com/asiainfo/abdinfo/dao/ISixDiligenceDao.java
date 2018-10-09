package com.asiainfo.abdinfo.dao;

import java.util.Map;

import com.asiainfo.abdinfo.po.SixDiligence;

public interface ISixDiligenceDao {
	
	//查询六项精进打卡内容
	public SixDiligence findSixDiligence(Map<String, Object> map);
	public SixDiligence findTips(Map<String, Object> map);
	public SixDiligence findReadFeeling(Map<String, Object> map);
	public SixDiligence findWork(Map<String, Object> map);
}
