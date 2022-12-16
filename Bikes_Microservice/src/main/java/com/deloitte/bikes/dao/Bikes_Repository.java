package com.deloitte.bikes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.bikes.entity.Bikes;

@Repository
public interface Bikes_Repository extends JpaRepository<Bikes, Integer>{
List<Bikes> findByCno(Integer cno);

Bikes findByBikename(String bikename);	
}
