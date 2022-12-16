package com.deloitte.vehicle.service;

import java.util.List;

import com.deloitte.vehicle.entity.Vehicle;

public interface Vehicle_Service {
    public Vehicle getVehicle(Integer id);
    public List<Vehicle> getVehicle();
    
    
}
