package com.asiainfo.abdinfo.controller.tips;

import java.text.ParseException;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.service.ISixDiligenceService;

@Controller
public class SixDiligenceController {
	
	@Resource 
	private ISixDiligenceService sixDiligenceService;
	
	@RequestMapping(value="/sixDiligence.do")
	public void findSixDiligence(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		
		String staffCode=request.getParameter("staffCode");
		Map<String, Object> map=new HashMap<String,Object>();
		String stutas=request.getParameter("stutas");
		if (stutas==null) {
			String date=request.getParameter("date");
			/*Date day=new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
			String date=df.format(day);
			System.out.println(df.format(day));*/
			map.put("date", date);
		}
		map.put("staffCode", staffCode);
		ResponseUtils.renderJson(response, JsonUtils.toJson(sixDiligenceService.findSixDiligence(map)));
	}
}
