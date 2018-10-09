package com.asiainfo.abdinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.PersonnelMapper;
import com.asiainfo.abdinfo.po.Personnel;
import com.asiainfo.abdinfo.service.PerService;

@Service("PerService")
public class PerServiceImpl implements PerService{

	@Resource
	private PersonnelMapper permapper;
	
	

	@Override
	public Personnel findByUser(String usercode, String password) {
		// TODO Auto-generated method stub
		return permapper.findByper(usercode, password);
	}



	@Override
	public List<Personnel> findAllPer() {
		// TODO Auto-generated method stub
		return permapper.findAllPer();
	}



	@Override
	public Personnel findByCode(String usercode) {
		// TODO Auto-generated method stub
		return permapper.findByCode(usercode);
	}

}
