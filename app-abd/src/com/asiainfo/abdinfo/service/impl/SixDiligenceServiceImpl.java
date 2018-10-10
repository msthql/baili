package com.asiainfo.abdinfo.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.ISixDiligenceDao;
import com.asiainfo.abdinfo.po.SixDiligence;
import com.asiainfo.abdinfo.service.ISixDiligenceService;

@Service
public class SixDiligenceServiceImpl implements ISixDiligenceService{
	
	@Resource
	private ISixDiligenceDao sixDiligenceDao;
	
	@Override
	public Map<String, Object> findSixDiligence(Map<String, Object> map) {
		System.out.println(map);
		SixDiligence sixDiligence=sixDiligenceDao.findSixDiligence(map);  //今日反思 n
		SixDiligence tips=sixDiligenceDao.findTips(map);        //感恩的人n
		SixDiligence readFeeling=sixDiligenceDao.findReadFeeling(map);  //读书感悟1
		SixDiligence works=sixDiligenceDao.findWork(map);   //工作z
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("sixDiligence",sixDiligence);
		data.put("tips",tips);
		data.put("readFeeling", readFeeling);
		data.put("works", works);
		return data;
	}

}
