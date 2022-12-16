package com.deloitte.ev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.ev.dao.EV_Repository;
import com.deloitte.ev.entity.EV;

@RestController
@RequestMapping("/electric")
public class EVController {
	@Autowired
	private EV_Repository evRepository;

	@GetMapping("/getElectric")
	public ResponseEntity<List<EV>> getEV() {
		List<EV> evList = evRepository.findAll();
		return new ResponseEntity<List<EV>>(evList, HttpStatus.OK);

	}

	@GetMapping("/getEV/{cno}")
	public ResponseEntity<List<EV>> getEVById(@PathVariable("cno") Integer cno) {
		List<EV> evList = evRepository.findByCno(cno);
		return new ResponseEntity<List<EV>>(evList, HttpStatus.OK);
	}

	@GetMapping("/EV/{distance}")
	public ResponseEntity<List<EV>> findByDistance(@PathVariable("distance") Integer distance) {
		List<EV> evList = new ArrayList<>();
		evList.add(evRepository.findByDistance(distance));
		return new ResponseEntity<List<EV>>(evList, HttpStatus.OK);
	}

}
