package com.deloitte.bikes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bikes {
	
	@Id
	private Integer cno;
	private String bikename;
	private Integer tyre_size;
	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bikes(Integer cno, String bikename, Integer tyre_size) {
		super();
		this.cno = cno;
		this.bikename = bikename;
		this.tyre_size = tyre_size;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public Integer getTyre_size() {
		return tyre_size;
	}
	public void setTyre_size(Integer tyre_size) {
		this.tyre_size = tyre_size;
	}
	
	

}
