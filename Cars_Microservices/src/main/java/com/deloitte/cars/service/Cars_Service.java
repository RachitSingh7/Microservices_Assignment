package com.deloitte.cars.service;

import java.util.List;

import com.deloitte.cars.entity.Cars;

public interface Cars_Service {
	public Cars getCarsByCno(Integer id);

	public Cars getCarsByCarname(String carname);

	public List<Cars> getCars();
}
