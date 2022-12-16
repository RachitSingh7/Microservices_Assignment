package com.deloitte.vehicle.model;

import java.util.List;

import com.deloitte.vehicle.entity.Vehicle;

public class Response {
	private Vehicle vehicle;
	private List<Cars> cars;
	private List<EV> ev;
	private List<Bikes> bikes;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Vehicle vehicle, List<Cars> cars, List<EV> ev, List<Bikes> bikes) {
		super();
		this.vehicle = vehicle;
		this.cars = cars;
		this.ev = ev;
		this.bikes = bikes;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public List<Cars> getCars() {
		return cars;
	}
	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	public List<EV> getEv() {
		return ev;
	}
	public void setEv(List<EV> ev) {
		this.ev = ev;
	}
	public List<Bikes> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bikes> bikes) {
		this.bikes = bikes;
	}

	
}