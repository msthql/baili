package com.asiainfo.abdinfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.asiainfo.abdinfo.dao.PersonnelMapper;
import com.asiainfo.abdinfo.po.Personnel;
import com.asiainfo.abdinfo.po.WorkPlan;
import com.asiainfo.abdinfo.service.PerService;
import com.asiainfo.abdinfo.service.WorkPlanService;
import com.ibm.db2.jcc.am.r;

@Service("PerService")
public class PerServiceImpl implements PerService{

	@Resource
	private PersonnelMapper permapper;
	@Resource
	private WorkPlanService wkser;
	


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



	@Override
	public List<Personnel> findAllBynowday(String usercode, String nowday) {
		// TODO Auto-generated method stub
		Personnel per=permapper.findByCode(usercode);
		List<Personnel> perlist=permapper.findBybm(per.getDepartment());
		List<Personnel> perlistk=new ArrayList<Personnel>();
		for (int i=0;i<perlist.size();i++) {
			List<WorkPlan> wkList=wkser.findnowday(perlist.get(i) .getUsercode(), nowday);
				perlist.get(i).setNewLogin(permapper.findbycode(perlist.get(i) .getUsercode()));
				perlist.get(i).setWplist(wkList);
				System.out.println(perlist.get(i));
				if (!perlist.get(i).getWplist().isEmpty()&&!perlist.get(i).getUsercode().equals(usercode)) {
					perlistk.add(perlist.get(i));
				}
		}
		return perlistk;
	}
}
