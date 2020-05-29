package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BRBloodResultVO;

@Repository
public interface BRBloodResultDao extends JpaRepository<BRBloodResultVO, Integer>{
	
	List<BRBloodResultVO> findByActivityId(Integer activityId);
}
