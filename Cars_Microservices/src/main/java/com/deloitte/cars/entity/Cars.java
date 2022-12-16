package com.deloitte.cars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cars {

	@Id
	private Integer cno;
	private String carname;
	private Integer seater;

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cars(Integer cno, String carname, Integer seater) {
		super();
		this.cno = cno;
		this.carname = carname;
		this.seater = seater;
	}

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Integer getSeater() {
		return seater;
	}

	public void setSeater(Integer seater) {
		this.seater = seater;
	}

	@Override
	public String toString() {
		return "Cars [cno=" + cno + ", carname=" + carname + ", seater=" + seater + "]";
	}
	

}
