package com.deloitte.bikes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.bikes.dao.Bikes_Repository;
import com.deloitte.bikes.entity.Bikes;

@RestController
@RequestMapping("/bikes")
public class Bikes_Controller {
	@Autowired
	private Bikes_Repository bikesRepository;
	
	@GetMapping("/getBikes")
	public ResponseEntity<List<Bikes>>getBikes(){
		List<Bikes>bikesList= bikesRepository.findAll();
		return new ResponseEntity<List<Bikes>>(bikesList,HttpStatus.OK);
	}
	
	@GetMapping("/getBike/{cno}")
	public ResponseEntity<List<Bikes>>getBikesById(@PathVariable("cno") Integer cno){
		List<Bikes> bikesList= bikesRepository.findByCno(cno);
		return new ResponseEntity<List<Bikes>>(bikesList,HttpStatus.OK);
	}
	
	@GetMapping("/getBikeByName/{bikename}")
	public ResponseEntity<List<Bikes>>findByBikename(@PathVariable("bikename")String bikename){
		List<Bikes> bikesList= new ArrayList<>();
		bikesList.add(bikesRepository.findByBikename(bikename));
		return new ResponseEntity<List<Bikes>>(bikesList,HttpStatus.OK);
	}

}
