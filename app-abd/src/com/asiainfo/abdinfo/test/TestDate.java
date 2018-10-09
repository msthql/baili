package com.asiainfo.abdinfo.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.abdinfo.po.BaseInformation;
import com.asiainfo.abdinfo.service.impl.BaseInformationImpl;
import com.asiainfo.abdinfo.service.impl.NewLoginImple;
import com.asiainfo.abdinfo.service.impl.ReadClockImple;

public class TestDate {

	@Test
	public void checser() {
		BaseInformationImpl mlcvp;
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		mlcvp = ac.getBean("BaseInformationService", BaseInformationImpl.class);
		List<BaseInformation> bas = mlcvp.getBaseInformation();
		System.out.println(bas);
	}

	@Test
	public void test2() {
		BaseInformationImpl mlcvp;
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		mlcvp = ac.getBean("BaseInformationService", BaseInformationImpl.class);
		mlcvp.getDeleteBaseInformation(3);
		System.out.println("afd");
	}

	@Test
	public void test3() {
		BaseInformationImpl mlcvp;
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		mlcvp = ac.getBean("BaseInformationService", BaseInformationImpl.class);
		mlcvp.addBaseInformation("通州区1", "3");
		System.out.println("成功");
	}

	
	@Test
	public void test4() {
		NewLoginImple mlcvp;
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-mvc.xml", "conf/spring-mybatis.xml");
		mlcvp = ac.getBean("NewLoginService", NewLoginImple.class);
//		Map map=new HashMap();
//		map.put("openId", "o1wLm5ZxhtAgb3To0IH4xrngy3H8");
//		map.put("nickName", "梦之缔造者");
		System.out.println(mlcvp.getNewUser("o1wLm5ZxhtAgb3To0IH4xrngy3H8"));
		
		
		
		
	
	}


	

	}

















