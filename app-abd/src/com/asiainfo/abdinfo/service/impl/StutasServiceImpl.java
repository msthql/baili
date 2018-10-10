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
		System.out.println(listAllFeeling);
		if (listAllFeeling.getPraise()==null) {
			listAllFeeling.setPraise("0");
		}
		if (listAllFeeling.getEnshrine()==null) {
			listAllFeeling.setEnshrine("0");
		}
		if (listAllFeeling.getFabulous()==null) {
			listAllFeeling.setFabulous("0");
		}
		List<Integer> list=stutaDao.selectEnshrine(listAllFeeling);
		
		if (listAllFeeling.getEnshrine().equals("1")) {
			if (!list.contains(listAllFeeling.getId())) {
				stutaDao.addEnshrine(listAllFeeling);
			}
		}else{
			stutaDao.deleteEnshrine(listAllFeeling);
		}
		System.out.println(stutaDao.addStutas(listAllFeeling));
		return stutaDao.addStutas(listAllFeeling);
	}
	
	@Override
	public List<ListAllFeeling> selectEnshrines(String staffCode) {
		// TODO Auto-generated method stub
		return stutaDao.selectEnshrines(staffCode);
	}

}
