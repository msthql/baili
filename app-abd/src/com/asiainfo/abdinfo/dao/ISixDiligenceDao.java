package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.asiainfo.abdinfo.po.SixDiligence;

public interface ISixDiligenceDao {
	
	//查询六项精进打卡内容
	public List<SixDiligence> findSixDiligence(Map<String, Object> map);
	/**
	 * 进晓宇到此一游
	 * @param map
	 * @return
	 */
	public List<SixDiligence> findTips(Map<String, Object> map);
	public List<SixDiligence> findReadFeeling(Map<String, Object> map);
	public List<SixDiligence> findWork(Map<String, Object> map);
	public List<SixDiligence> findWorks(Map<String, Object> map);
}
