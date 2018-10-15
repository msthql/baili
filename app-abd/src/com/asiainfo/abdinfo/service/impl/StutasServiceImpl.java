package com.asiainfo.abdinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.IStutasDao;
import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.service.IStutasService;
@Service("IStutasService")
public class StutasServiceImpl implements IStutasService{
	
	@Autowired
	private IStutasDao stutaDao;
	
	@Override
	public int addStutas(ListAllFeeling listAllFeeling) {
		ListAllFeeling stutasListAllFeeling=stutaDao.findPariseNum(listAllFeeling);
		if (listAllFeeling.getPraise()==null) {
			listAllFeeling.setPraise("0");
			listAllFeeling.setPraiseNum(0);
		}
		if (listAllFeeling.getEnshrine()==null) {
			listAllFeeling.setEnshrine("0");
			listAllFeeling.setEnshrineNum(0);
		}
		if (listAllFeeling.getFabulous()==null) {
			listAllFeeling.setFabulous("0");
			listAllFeeling.setFabulousNum(0);
		}
		if (listAllFeeling.getPraise().equals("1")) {
			listAllFeeling.setPraiseNum(stutasListAllFeeling.getPraiseNum()+1);
		}else {
			listAllFeeling.setPraiseNum(stutasListAllFeeling.getPraiseNum()-1);
		}
		if (listAllFeeling.getFabulous().equals("1")) {
			listAllFeeling.setFabulousNum(stutasListAllFeeling.getFabulousNum()+1);
		}else {
			listAllFeeling.setFabulousNum(stutasListAllFeeling.getFabulousNum()-1);
		}
		List<Integer> list=stutaDao.selectEnshrine(listAllFeeling);
		
		if (listAllFeeling.getEnshrine().equals("1")) {
			listAllFeeling.setEnshrineNum(stutasListAllFeeling.getEnshrineNum()+1);
			if (!list.contains(listAllFeeling.getId())) {//判断list集合中是否存在某个值
				stutaDao.addEnshrine(listAllFeeling);
			}
		}else{
			stutaDao.deleteEnshrine(listAllFeeling);
			listAllFeeling.setEnshrineNum(stutasListAllFeeling.getEnshrineNum()-1);
		}
		return stutaDao.addStutas(listAllFeeling);
	}
	
	@Override
	public List<ListAllFeeling> selectEnshrines(String staffCode) {
		// TODO Auto-generated method stub
		return stutaDao.selectEnshrines(staffCode);
	}

}
