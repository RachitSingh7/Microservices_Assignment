package com.deloitte.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.cars.dao.Cars_Repository;
import com.deloitte.cars.entity.Cars;

@Service("carsService")
public class Cars_Service_Impl implements Cars_Service{

	@Autowired
	private Cars_Repository carsRepository;
	
	@Override
	public Cars getCarsByCno(Integer id) {
		return carsRepository.getCarsByCno(id);
	}
	@Override
	public List<Cars> getCars(){
		return (List<Cars>)carsRepository.findAll();
	}
	@Override
	public Cars getCarsByCarname(String carname){
		return carsRepository.getCarsByCarname(carname);	
	}
	 
}
