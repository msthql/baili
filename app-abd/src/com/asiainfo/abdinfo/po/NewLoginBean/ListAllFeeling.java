package com.asiainfo.abdinfo.po.NewLoginBean;

import java.io.Serializable;
import java.util.Date;

public class ListAllFeeling implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	//章节名称
	private String clockDirectory;
	//rd.`姓名` as staffName, 
	private String staffName;
	
	//rr.staffCode,
	private String staffCode;
	
	//rr.timeLength,
	private String timeLength;
	
	//时间
	private Date date;
	
	//rr.ReadingFeeling,
	private String ReadingFeeling;
	
	//rr.num,
	private String num;
	
	//uu.`微信名` as nickName,
	private String nickName;
	
	//uu.`头像` as avatarUrl
	private String avatarUrl;
	
	//点赞状态  praise
	private String praise;
	
	//点赞个数 praiseNum
	private Integer praiseNum;
	
	//超赞状态 fabulous
	private String fabulous;
	
	//超赞个数 fabulousNum
	private Integer fabulousNum;
	
	//收藏状态 enshrine
	private String enshrine;
	
	//收藏个数 enshrineNum
	private Integer enshrineNum;
	
	private String actualReading;

	public String getActualReading() {
		return actualReading;
	}

	public void setActualReading(String actualReading) {
		this.actualReading = actualReading;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(String timeLength) {
		this.timeLength = timeLength;
	}

	public String getReadingFeeling() {
		return ReadingFeeling;
	}

	public void setReadingFeeling(String readingFeeling) {
		ReadingFeeling = readingFeeling;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getPraise() {
		return praise;
	}

	public void setPraise(String praise) {
		this.praise = praise;
	}

	public Integer getPraiseNum() {
		return praiseNum;
	}

	public void setPraiseNum(Integer praiseNum) {
		this.praiseNum = praiseNum;
	}

	public String getFabulous() {
		return fabulous;
	}

	public void setFabulous(String fabulous) {
		this.fabulous = fabulous;
	}

	public Integer getFabulousNum() {
		return fabulousNum;
	}

	public void setFabulousNum(Integer fabulousNum) {
		this.fabulousNum = fabulousNum;
	}

	public String getEnshrine() {
		return enshrine;
	}

	public void setEnshrine(String enshrine) {
		this.enshrine = enshrine;
	}

	public Integer getEnshrineNum() {
		return enshrineNum;
	}

	public void setEnshrineNum(Integer enshrineNum) {
		this.enshrineNum = enshrineNum;
	}

	public String getClockDirectory() {
		return clockDirectory;
	}

	public void setClockDirectory(String clockDirectory) {
		this.clockDirectory = clockDirectory;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ListAllFeeling [id=" + id + ", clockDirectory=" + clockDirectory + ", staffName=" + staffName
				+ ", staffCode=" + staffCode + ", timeLength=" + timeLength + ", ReadingFeeling=" + ReadingFeeling
				+ ", num=" + num + ", nickName=" + nickName + ", avatarUrl=" + avatarUrl + ", praise=" + praise
				+ ", praiseNum=" + praiseNum + ", fabulous=" + fabulous + ", fabulousNum=" + fabulousNum + ", enshrine="
				+ enshrine + ", enshrineNum=" + enshrineNum + ", actualReading=" + actualReading + "]";
	}

	


	
	

}






