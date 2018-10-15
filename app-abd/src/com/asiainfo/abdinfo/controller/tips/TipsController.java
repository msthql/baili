package com.asiainfo.abdinfo.controller.tips;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.Menus;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.service.ITipsService;
import com.mysql.fabric.xmlrpc.base.Data;
import com.sun.jmx.snmp.Timestamp;

@Controller
public class TipsController {
	
	@Resource
	private ITipsService tipsService;
	@RequestMapping(value="/addtips.do")
	@ResponseBody
	public boolean addTips( HttpServletRequest request,HttpServletResponse response) throws ParseException{
		String charu=request.getParameter("gengXinHuoChaRu");
		String department=request.getParameter("department");
		String staffCode=request.getParameter("staffCode");
		String tips=request.getParameter("tips");
		String menus=request.getParameter("menus");
		String time=request.getParameter("date");
		/*SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String time=df.format(new Date());
		Date date=df.parse(time);*/
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("time",time);
		map.put("tips", tips);
		map.put("department", department);
		map.put("staffCode", staffCode);
		map.put("menus", menus);
		int num1=0;
		int num2=0;
		if (charu.equals("charu")) {
			num1=tipsService.addTipsDailyfeeling(map);
		}else if(charu.equals("gengxin")){
			num2=tipsService.updateTipsDailyfeeling(map);
		}else{
			System.out.println("程序可能发生异常");
		}
		
		if (num1>0||num2>0) {
			return true;
		}else{
			return false;
		}
	}
	@RequestMapping(value="/show.do")
	@ResponseBody
	public void show(HttpServletRequest request,HttpServletResponse response){
		String staffCode=(String)request.getParameter("staffCode");
		Map map = new HashMap();
		map.put("staffCode", staffCode);
		List<User> b=tipsService.findTips(map);
		/*List<String> namelist=new ArrayList<String>();
		for (User u : b) {
			namelist.add(u.getStaffName());
		}*/
		ResponseUtils.renderJson(response, JsonUtils.toJson(b));
		
	}
}







