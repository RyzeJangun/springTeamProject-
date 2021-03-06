package com.example.test.model.user_fund.dto;

import java.util.Date;

public class UserFundDTO {

	private int u_bno;
	private int bno;
	private String userid;
	private String grade;
	private String project_name;
	private String company_name;
	private int unit;
	private int count;
	private int discount;
	private int now_fund;
	private Date buy_date;
	private String title_img;//타이틀 이미지
	private String title_img2;//타이틀 이미지2
	private String title_img3;//타이틀 이미지3
	
	public String getTitle_img() {
		return title_img;
	}
	public void setTitle_img(String title_img) {
		this.title_img = title_img;
	}
	public String getTitle_img2() {
		return title_img2;
	}
	public void setTitle_img2(String title_img2) {
		this.title_img2 = title_img2;
	}
	public String getTitle_img3() {
		return title_img3;
	}
	public void setTitle_img3(String title_img3) {
		this.title_img3 = title_img3;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getU_bno() {
		return u_bno;
	}
	public void setU_bno(int u_bno) {
		this.u_bno = u_bno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getNow_fund() {
		return now_fund;
	}
	public void setNow_fund(int now_fund) {
		this.now_fund = now_fund;
	}
	public Date getBuy_date() {
		return buy_date;
	}
	public void setBuy_date(Date buy_date) {
		this.buy_date = buy_date;
	}
	@Override
	public String toString() {
		return "UserFundDTO [u_bno=" + u_bno + ", bno=" + bno + ", userid=" + userid + ", grade=" + grade
				+ ", project_name=" + project_name + ", company_name=" + company_name + ", unit=" + unit + ", count="
				+ count + ", discount=" + discount + ", now_fund=" + now_fund + ", buy_date=" + buy_date
				+ ", title_img=" + title_img + ", title_img2=" + title_img2 + ", title_img3=" + title_img3 + "]";
	}
	
}
