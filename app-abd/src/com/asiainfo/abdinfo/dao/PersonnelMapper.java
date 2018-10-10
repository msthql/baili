package com.asiainfo.abdinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.Personnel;

public interface PersonnelMapper {
	
	
	public List<Personnel> findAllPer();
	
	public Personnel findByCode(@Param("usercode") String usercode);
	
	public List<Personnel> findBybm(@Param("bumen") String bumen);
	
}
