package com.asiainfo.abdinfo.dao;

import java.util.List;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;

public interface IStutasDao {
	
	public int addStutas( ListAllFeeling listAllFeeling);
     /**
      * 进晓宇	
      */

	//更新收藏信息
	public int addEnshrine( ListAllFeeling listAllFeeling);
	//查询收藏信息
	public List<Integer> selectEnshrine( ListAllFeeling listAllFeeling);
	//删除收藏信息
	public int deleteEnshrine( ListAllFeeling listAllFeeling);
	//查询全部收藏信息
	public List<ListAllFeeling> selectEnshrines( String staffCode);
}
