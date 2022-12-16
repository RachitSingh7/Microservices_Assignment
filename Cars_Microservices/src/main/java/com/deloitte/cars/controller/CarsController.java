package com.deloitte.cars.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.cars.dao.Cars_Repository;
import com.deloitte.cars.entity.Cars;
import com.deloitte.cars.service.Cars_Service;

@RestController
@RequestMapping("/orders")
public class CarsController {
	@Autowired
	private Cars_Service carsService;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getOrders")
	public ResponseEntity<List<Cars>> getCars() {
		List<Cars> carsList = carsService.getCars();
		return new ResponseEntity<List<Cars>>(carsList, HttpStatus.OK);
	}

	@GetMapping("/getOrder/{cno}")
	public ResponseEntity<List<Cars>> getCarsByCno(@PathVariable("cno") Integer cno) {
		List<Cars> carsList = carsService.getCars();
		return new ResponseEntity<List<Cars>>(carsList, HttpStatus.OK);
	}

	@GetMapping("/goOrders/{carname}")
	public ResponseEntity<List<Cars>> findByCarname(@PathVariable("carname") String carname) {
		List<Cars> carsList = new ArrayList<>();
		carsList.add(carsService.getCarsByCarname(carname));
		return new ResponseEntity<List<Cars>>(carsList, HttpStatus.OK);
	}

}
