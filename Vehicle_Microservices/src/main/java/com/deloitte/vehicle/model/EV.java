package com.deloitte.vehicle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EV {
	@Id
	private Integer cno;
	private Integer distance;
	private Integer charging_time;
	private String removable_battery;
	public EV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EV(Integer cno, Integer distance, Integer charging_time, String removable_battery) {
		super();
		this.cno = cno;
		this.distance = distance;
		this.charging_time = charging_time;
		this.removable_battery = removable_battery;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public Integer getCharging_time() {
		return charging_time;
	}
	public void setCharging_time(Integer charging_time) {
		this.charging_time = charging_time;
	}
	public String getRemovable_battery() {
		return removable_battery;
	}
	public void setRemovable_battery(String removable_battery) {
		this.removable_battery = removable_battery;
	}
	

}

