package com.deloitte.vehicle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.vehicle.entity.Vehicle;

@Repository
public interface Vehicle_Repository extends JpaRepository<Vehicle, Integer> {

}
