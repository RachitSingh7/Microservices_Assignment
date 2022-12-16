package com.deloitte.cars.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.cars.entity.Cars;

@Repository
public interface Cars_Repository extends JpaRepository<Cars, Integer> {
	List<Cars> findByCno(Integer cno);

	Cars getCarsByCarname(String carname);

	Cars getCarsByCno(Integer id);

}
