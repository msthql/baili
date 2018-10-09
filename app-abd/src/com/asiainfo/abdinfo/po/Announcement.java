package com.asiainfo.abdinfo.po;

import java.io.Serializable;
import java.util.Date;

public class Announcement implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//公告ID
	private int id;
	
	//人员编码
	private String staffCode;
	
	//公告内容
	private String annoContent;
	
	//公告发布的开始时间
	private Date beginTime;
	
	//公告发布的结束时间
	private Date endTime;
	
	//状态
	private int annState;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getAnnoContent() {
		return annoContent;
	}

	public void setAnnoContent(String annoContent) {
		this.annoContent = annoContent;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getAnnState() {
		return annState;
	}

	public void setAnnState(int annState) {
		this.annState = annState;
	}

	@Override
	public String toString() {
		return "Announcement [id=" + id + ", staffCode=" + staffCode + ", annoContent=" + annoContent + ", beginTime="
				+ beginTime + ", endTime=" + endTime + ", annState=" + annState + "]";
	}
	
	


}
