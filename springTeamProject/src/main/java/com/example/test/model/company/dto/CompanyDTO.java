package com.example.test.model.company.dto;

import java.util.Date;

public class CompanyDTO {

	private int com_no;
	private String company_name;
	private String ceo;
	private String c_division;
	private int employee;
	private String found_date;
	private Date append_date;
	private String greeting;
	private String company_num;
	private String logo;
	private int c_value;
	private String sectors;
	private String email;
	private String address1;
	private String address2;
	private String address3;
	private String homepage;
	private String manager;
	private int approve;
	
	public int getCom_no() {
		return com_no;
	}
	public void setCom_no(int com_no) {
		this.com_no = com_no;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getC_division() {
		return c_division;
	}
	public void setC_division(String c_division) {
		this.c_division = c_division;
	}
	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	public String getFound_date() {
		return found_date;
	}
	public void setFound_date(String found_date) {
		this.found_date = found_date;
	}
	public Date getAppend_date() {
		return append_date;
	}
	public void setAppend_date(Date append_date) {
		this.append_date = append_date;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getCompany_num() {
		return company_num;
	}
	public void setCompany_num(String company_num) {
		this.company_num = company_num;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public int getC_value() {
		return c_value;
	}
	public void setC_value(int c_value) {
		this.c_value = c_value;
	}
	public String getSectors() {
		return sectors;
	}
	public void setSectors(String sectors) {
		this.sectors = sectors;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public int getApprove() {
		return approve;
	}
	public void setApprove(int approve) {
		this.approve = approve;
	}
	@Override
	public String toString() {
		return "CompanyDTO [com_no=" + com_no + ", company_name=" + company_name + ", ceo=" + ceo + ", c_division="
				+ c_division + ", employee=" + employee + ", found_date=" + found_date + ", append_date=" + append_date
				+ ", greeting=" + greeting + ", company_num=" + company_num + ", logo=" + logo + ", c_value=" + c_value
				+ ", sectors=" + sectors + ", email=" + email + ", address1=" + address1 + ", address2=" + address2
				+ ", address3=" + address3 + ", homepage=" + homepage + ", manager=" + manager + ", approve=" + approve
				+ "]";
	}
	
}
