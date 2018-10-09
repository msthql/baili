package com.asiainfo.abdinfo.controller.readClock;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.po.NewLoginBean.ListAllFeeling;
import com.asiainfo.abdinfo.service.IStutasService;

@Controller
public class StutasController {
	@Resource
	private IStutasService stutasService;
	
	@RequestMapping(value="/addStutas.do")
	@ResponseBody
	public void stutas(HttpServletRequest request,HttpServletResponse response){
		String stutas=request.getParameter("stutas");
		JSONArray jsonArray=JSONArray.parseArray(stutas);
		String result="";
		if (jsonArray!=null) {
			for (Object object : jsonArray) {
				String str=object.toString();
				ListAllFeeling listAllFeeling=JSON.parseObject(str,ListAllFeeling.class);
				System.out.println(listAllFeeling+"这是获取的数据");
				stutasService.addStutas(listAllFeeling);
			}
		}
		ResponseUtils.renderJson(response, result);
	}
}
