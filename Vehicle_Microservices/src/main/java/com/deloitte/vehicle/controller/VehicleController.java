package com.deloitte.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.vehicle.entity.Vehicle;
import com.deloitte.vehicle.model.Bikes;
import com.deloitte.vehicle.model.Cars;
import com.deloitte.vehicle.model.EV;
import com.deloitte.vehicle.model.Response;
import com.deloitte.vehicle.service.Vehicle_Service;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private Vehicle_Service vehicleService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getVehicle(@PathVariable("id") Integer id) {
		Vehicle vehicle = vehicleService.getVehicle(id);
		List<Cars> carsList = restTemplate.getForObject("http://localhost:8082/orders/getOrder/" + id, List.class);
		List<Bikes> bikesList = restTemplate.getForObject("http://localhost:8083/bikes/getBike/"+id, List.class);
		List<EV> evList= restTemplate.getForObject("http://localhost:8085/electric/getEV/"+id, List.class);
		Response response = new Response(vehicle, carsList, evList, bikesList);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Vehicle>> getVehicle() {

		List<Vehicle> vehicleList = vehicleService.getVehicle();
		return new ResponseEntity<List<Vehicle>>(vehicleList, HttpStatus.OK);

	}

}
