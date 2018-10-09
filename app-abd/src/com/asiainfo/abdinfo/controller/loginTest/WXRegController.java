package com.asiainfo.abdinfo.controller.loginTest;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asiainfo.abdinfo.common.ErrorCode;
import com.asiainfo.abdinfo.common.JsonUtils;
import com.asiainfo.abdinfo.common.ResponseUtils;
import com.asiainfo.abdinfo.common.ReturnResult;
import com.asiainfo.abdinfo.po.User;
import com.asiainfo.abdinfo.po.NewLoginBean.NewLogin;
import com.asiainfo.abdinfo.service.NewLoginService;
import com.asiainfo.abdinfo.service.ReadClockService;
import com.asiainfo.abdinfo.service.UserService;

@Controller
@RequestMapping(value="/user")
public class WXRegController {
	
	
	@Autowired
	private NewLoginService newLoginService;
	
	@Autowired
	private ReadClockService readClockService;
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/reg.do",method=RequestMethod.POST)
	public String regController(HttpServletRequest request, HttpServletResponse response,HttpSession session){
		String userId=request.getParameter("userId");
		String password=request.getParameter("pwd");
		String openId=request.getParameter("openId");
		System.out.println(userId+password);
		Map map=new HashMap();
	    map.put("staffCode", userId);
	    map.put("staffPwd", password);
		User user = null;
		if(!StringUtils.isEmpty(userId) && !StringUtils.isEmpty(password)){
			user = userService.getUserByIdAndName(map);
			if(user != null){
				session.setAttribute("staffCode", userId);	
				newLoginService.regUser(userId,  password,  openId);
				return ReturnResult.successJson(null);
			}else{
				return ReturnResult.failJson(ErrorCode.NO_AUTH);
			}
		}else{
			return ReturnResult.failJson(ErrorCode.PARAM_EMPTY);
		}
		
		
		
     	}
	
	
	/**
	 * 
	 * 尝试
	 * @param request
	 * @param response
	 */
	 @RequestMapping(value = "/ClockInf.do")
		public void readClockCon( HttpServletRequest request, HttpServletResponse response) {
			String openId=request.getParameter("openId");
//			Map<String,String> map=new HashMap<String,String>();
//			map.put("openId", openId);
			 NewLogin  nn=newLoginService.getNewUser(openId);
			String clockDate=request.getParameter("clockDate");
			Map re=readClockService.getReadIndex(nn.getStaffCode(),clockDate);
			System.out.println(clockDate+openId);
			ResponseUtils.renderJson(response, JsonUtils.toJson(re));	
		}
	 
	 @ResponseBody
	 @RequestMapping(value = "/newUser.do")
		public void getNewUser( HttpServletRequest request, HttpServletResponse response) {
		 String openId= request.getParameter("openId");
			ResponseUtils.renderJson(response, JsonUtils.toJson(newLoginService.getNewUser(openId).getStaffCode()));	
		}
	 
	 
	 

}
