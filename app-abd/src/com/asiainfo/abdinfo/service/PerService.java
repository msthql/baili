package com.asiainfo.abdinfo.service;

import java.util.List;

import com.asiainfo.abdinfo.po.Personnel;


public interface PerService {
	 
  
  public List<Personnel> findAllPer();
  
  public Personnel findByCode(String usercode);
  
  public List<Personnel> findAllBynowday(String usercode,String nowday);
}
