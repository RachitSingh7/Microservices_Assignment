package com.deloitte.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.vehicle.dao.Vehicle_Repository;
import com.deloitte.vehicle.entity.Vehicle;

@Service
public class Vehicle_Service_Impl implements Vehicle_Service{

	@Autowired 
	private Vehicle_Repository vehicleRepository;
	
	@Override
	public Vehicle getVehicle(Integer id) {
		return vehicleRepository.findById(id).get();
	}
	
	@Override 
	public List<Vehicle> getVehicle(){
		return vehicleRepository.findAll();
	}
}
