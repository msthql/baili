package com.asiainfo.abdinfo.controller.basicInformation;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.Personnel;
import com.asiainfo.abdinfo.service.PerService;

@Controller
public class PerWeb {
	@Autowired
	private PerService perservice;
	
	@RequestMapping(value="/findName.do")
	public void findName(HttpServletRequest request,HttpServletResponse response){
		List<Personnel> list=perservice.findAllPer();
		List<String> namelist=new ArrayList<String>();
		for (Personnel per : list) {
			namelist.add(per.getUsername());
		}
		for (Personnel per : list) {
			namelist.add(per.getUsername());
		}
		ResponseUtils.renderJson(response, JsonUtils.toJson(namelist));
  
	}
	
	@RequestMapping("/findAllnowday.do")
	public void findAllnowday(HttpServletRequest request,HttpServletResponse response,String usercode,String nowday){
		List<Personnel> perlist=perservice.findAllBynowday(usercode, nowday);
		ResponseUtils.renderJson(response, JsonUtils.toJson(perlist));
	}
}

