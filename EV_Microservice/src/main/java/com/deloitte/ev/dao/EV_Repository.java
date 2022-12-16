package com.deloitte.ev.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.ev.entity.EV;

@Repository
public interface EV_Repository extends JpaRepository<EV, Integer> {
	List<EV> findByCno(Integer cno);

	EV findByDistance(Integer distance);

}
