package com.deloitte.vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cno;
	private String company_name;
	private Integer outlets_no;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String company_name, Integer company_no, Integer outlets_no) {
		super();
		this.company_name = company_name;
		this.cno = cno;
		this.outlets_no = outlets_no;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public Integer getOutlets_no() {
		return outlets_no;
	}

	public void setOutlets_no(Integer outlets_no) {
		this.outlets_no = outlets_no;
	}

}
