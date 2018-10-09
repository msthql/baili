package com.asiainfo.abdinfo.po;

public class Personnel {
			  private String 人员编码;
	          private String 姓名;
		      private String 部门;
		      private Integer ID;
		      private String 事业部;
		      private Integer 事业部id;
		      private String 职称;
		      private String 岗位;
		      private String 职位;
		      private String 登录密码;
		      private Integer 数据级别;
		      private java.time.LocalDate 开始日期;
		      private String 特殊状态;
		      private String 权限;
		      private String 备注;
			public String get姓名() {
				return 姓名;
			}
			public void set姓名(String 姓名) {
				this.姓名 = 姓名;
			}
			public String get部门() {
				return 部门;
			}
			public void set部门(String 部门) {
				this.部门 = 部门;
			}
			public Integer getID() {
				return ID;
			}
			public void setID(Integer iD) {
				ID = iD;
			}
			public String get事业部() {
				return 事业部;
			}
			public void set事业部(String 事业部) {
				this.事业部 = 事业部;
			}
			public Integer get事业部id() {
				return 事业部id;
			}
			public void set事业部id(Integer 事业部id) {
				this.事业部id = 事业部id;
			}
			public String get职称() {
				return 职称;
			}
			public void set职称(String 职称) {
				this.职称 = 职称;
			}
			public String get岗位() {
				return 岗位;
			}
			public void set岗位(String 岗位) {
				this.岗位 = 岗位;
			}
			public String get职位() {
				return 职位;
			}
			public void set职位(String 职位) {
				this.职位 = 职位;
			}
			public String get登录密码() {
				return 登录密码;
			}
			public void set登录密码(String 登录密码) {
				this.登录密码 = 登录密码;
			}
			public Integer get数据级别() {
				return 数据级别;
			}
			public void set数据级别(Integer 数据级别) {
				this.数据级别 = 数据级别;
			}
			public java.time.LocalDate  get开始日期() {
				return 开始日期;
			}
			public void set开始日期(java.time.LocalDate  开始日期) {
				this.开始日期 = 开始日期;
			}
			public String get特殊状态() {
				return 特殊状态;
			}
			public void set特殊状态(String 特殊状态) {
				this.特殊状态 = 特殊状态;
			}
			public String get权限() {
				return 权限;
			}
			public void set权限(String 权限) {
				this.权限 = 权限;
			}
			public String get备注() {
				return 备注;
			}
			public void set备注(String 备注) {
				this.备注 = 备注;
			}
			
			public String get人员编码() {
				return 人员编码;
			}
			public void set人员编码(String 人员编码) {
				this.人员编码 = 人员编码;
			}
			@Override
			public String toString() {
				return "Personnel [姓名=" + 姓名 + ", 部门=" + 部门 + ", ID=" + ID
						+ ", 事业部=" + 事业部 + ", 事业部id=" + 事业部id + ", 职称=" + 职称
						+ ", 岗位=" + 岗位 + ", 职位=" + 职位 + ", 登录密码=" + 登录密码
						+ ", 数据级别=" + 数据级别 + ", 开始日期=" + 开始日期 + ", 特殊状态="
						+ 特殊状态 + ", 权限=" + 权限 + ", 备注=" + 备注 + "]";
				
			}

		      
}
