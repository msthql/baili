package com.asiainfo.abdinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.Personnel;

public interface PersonnelMapper {
	
	
	public Personnel findByper(@Param("usercode") String usercode,@Param("userpwd") String userpwd);
	
	public List<Personnel> findAllPer();
	
	public Personnel findByCode(@Param("usercode") String usercode);
	
}
