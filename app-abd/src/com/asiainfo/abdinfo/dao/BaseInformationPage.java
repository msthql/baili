package com.asiainfo.abdinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.abdinfo.po.BaseInformation;

/**
 * 进晓宇
 * @author Administrator
 *
 */
public interface BaseInformationPage {
	
	
	List<BaseInformation>  findBaseInformation (Map id);
	
	List<BaseInformation>   findBaseInformation ();
	
	void DeleteBaseInformation(@Param(value="id") Integer id);
	
	void addBaseInformation(@Param(value="areaName") String areaName ,@Param(value="priority") String priority);
	
	
	
	
	
}




