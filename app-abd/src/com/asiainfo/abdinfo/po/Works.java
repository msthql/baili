package com.asiainfo.abdinfo.po;

import java.io.Serializable;

public class Works implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5778657439139609236L;
	private Integer id;
	private String work;
	public Works() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	

}
