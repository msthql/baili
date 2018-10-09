package com.asiainfo.abdinfo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.asiainfo.abdinfo.dao.ITipsDao;
import com.asiainfo.abdinfo.po.Menus;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.service.ITipsService;

@Service("ITipsService")
@Transactional
public class TipsServiceImpl implements ITipsService{
	
	@Resource
	private ITipsDao tipsDao;
	
	@Override
	public int addTipsDailyfeeling(Map<String, Object> map) {
		JSONArray jsonArray=JSONArray.parseArray((String)map.get("menus"));
		JSONArray tipsArray=JSONArray.parseArray((String)map.get("tips"));
		try {
			int num2=0;
			int num1=0;
			for (Object object : jsonArray) {
				String str=object.toString();
				Menus menus2=(Menus)JSON.parseObject(str,Menus.class);
				String per=menus2.getPers();
				String detail=menus2.getDetail();
				Integer id=menus2.getId();
				map.put("per", per);
				map.put("detail", detail);
				map.put("id", id);
				num2=tipsDao.addTipsOwes_content(map);
				if(num2<1){
					break;
				}
			};
			for (Object object : tipsArray) {
				String str=object.toString();
				Menus menus2=(Menus)JSON.parseObject(str,Menus.class);
				String type=menus2.getType();
				String content=menus2.getContent();
				map.put("type", type);
				map.put("content", content);
				num1=tipsDao.addTipsDailyfeeling(map);
				if(num1<1){
					break;
				}
			}
			if (num1>0||num2>0) {
				return 1;
			}else{
				throw new Exception();
			}
		} catch (Exception e) {
			//手动回滚事务  
		//	TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			return 0;
		}
	}

	@Override
	public List<User> findTips(Map<String, Object> map) {
		return tipsDao.findTips(map);
	}

	@Override
	public int updateTipsDailyfeeling(Map<String, Object> map) {
		JSONArray jsonArray=JSONArray.parseArray((String)map.get("menus"));
		JSONArray tipsArray=JSONArray.parseArray((String)map.get("tips"));
		try {
			int num2=0;
			int num1=0;
			for (Object object : jsonArray) {
				String str=object.toString();
				Menus menus2=(Menus)JSON.parseObject(str,Menus.class);
				String per=menus2.getPers();
				String detail=menus2.getDetail();
				Integer id=menus2.getId();
				map.put("per", per);
				map.put("detail", detail);
				map.put("id", id);
				num2=tipsDao.updateTipsOwes_content(map);
				if(num2<1){
					break;
				}
			};
			for (Object object : tipsArray) {
				String str=object.toString();
				Menus menus2=(Menus)JSON.parseObject(str,Menus.class);
				String type=menus2.getType();
				String content=menus2.getContent();
				map.put("type", type);
				map.put("content", content);
				num1=tipsDao.updateTipsDailyfeeling(map);
				if(num1<1){
					break;
				}
			}
			if (num1>0||num2>0) {
				return 1;
			}else{
				return 0;
			}
		} catch (Exception e) {
			//手动回滚事务
		//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			return 0;
		}
	}

	


}
