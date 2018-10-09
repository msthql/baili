package com.asiainfo.abdinfo.service;

import java.util.List;

import com.asiainfo.abdinfo.po.Personnel;


public interface PerService {
	  
  public Personnel findByUser(String usercode,String password);
  
  public List<Personnel> findAllPer();
  
  public Personnel findByCode(String usercode);
}
