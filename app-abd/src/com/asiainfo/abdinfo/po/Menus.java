package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Menus implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 366097693828797330L;
	private Integer id;
	private String Pers;
	private String Detail;
	private String type;
	private String content;
	public Menus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Menus(Integer id, String pers, String detail, String type, String content) {
		super();
		this.id = id;
		Pers = pers;
		Detail = detail;
		this.type = type;
		this.content = content;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPers() {
		return Pers;
	}
	public void setPers(String pers) {
		Pers = pers;
	}
	public String getDetail() {
		return Detail;
	}
	public void setDetail(String detail) {
		Detail = detail;
	}
	
}
