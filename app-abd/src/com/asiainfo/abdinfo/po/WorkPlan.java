package com.asiainfo.abdinfo.po;

public class WorkPlan {
			    private Integer  id;
		        private String  部门;
		        private String  人员编码;
		        private String  姓名;
		        private String  日期;
		        private String  类型;
		        private String  项目名称;
		        private String  计划时长;
		        private String  实际时长;
		        private String  计划完成内容;
		        private String  对接人;
		        private String  完成率;
		        private String  未完成原因;
		        private String  实际完成内容;
				public Integer getId() {
					return id;
				}
				public void setId(Integer id) {
					this.id = id;
				}
				public String get部门() {
					return 部门;
				}
				public void set部门(String 部门) {
					this.部门 = 部门;
				}
				public String get人员编码() {
					return 人员编码;
				}
				public void set人员编码(String 人员编码) {
					this.人员编码 = 人员编码;
				}
				public String get姓名() {
					return 姓名;
				}
				public void set姓名(String 姓名) {
					this.姓名 = 姓名;
				}
				public String get日期() {
					return 日期;
				}
				public void set日期(String 日期) {
					this.日期 = 日期;
				}
				public String get类型() {
					return 类型;
				}
				public void set类型(String 类型) {
					this.类型 = 类型;
				}
				public String get项目名称() {
					return 项目名称;
				}
				public void set项目名称(String 项目名称) {
					this.项目名称 = 项目名称;
				}
				public String get计划时长() {
					return 计划时长;
				}
				public void set计划时长(String 计划时长) {
					this.计划时长 = 计划时长;
				}
				public String get实际时长() {
					return 实际时长;
				}
				public void set实际时长(String 实际时长) {
					this.实际时长 = 实际时长;
				}
				public String get计划完成内容() {
					return 计划完成内容;
				}
				public void set计划完成内容(String 计划完成内容) {
					this.计划完成内容 = 计划完成内容;
				}
				public String get对接人() {
					return 对接人;
				}
				public void set对接人(String 对接人) {
					this.对接人 = 对接人;
				}
				public String get完成率() {
					return 完成率;
				}
				public void set完成率(String 完成率) {
					this.完成率 = 完成率;
				}
				public String get未完成原因() {
					return 未完成原因;
				}
				public void set未完成原因(String 未完成原因) {
					this.未完成原因 = 未完成原因;
				}
				public String get实际完成内容() {
					return 实际完成内容;
				}
				public void set实际完成内容(String 实际完成内容) {
					this.实际完成内容 = 实际完成内容;
				}
				@Override
				public String toString() {
					return "WorkPlan [id=" + id + ", 部门=" + 部门 + ", 人员编码="
							+ 人员编码 + ", 姓名=" + 姓名 + ", 日期=" + 日期 + ", 类型=" + 类型
							+ ", 项目名称=" + 项目名称 + ", 计划时长=" + 计划时长 + ", 实际时长="
							+ 实际时长 + ", 计划完成内容=" + 计划完成内容 + ", 对接人=" + 对接人
							+ ", 完成率=" + 完成率 + ", 未完成原因=" + 未完成原因 + ", 实际完成内容="
							+ 实际完成内容 + "]";
				}
		        

}
