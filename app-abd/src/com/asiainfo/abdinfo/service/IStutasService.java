package com.asiainfo.abdinfo.service;

import java.util.List;

import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;

public interface IStutasService {

	public int addStutas(ListAllFeeling listAllFeeling);
	//查询全部收藏信息
	public List<ListAllFeeling> selectEnshrines( String staffCode);
}
