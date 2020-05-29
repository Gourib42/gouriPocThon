package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.OrganisationVO;

public interface OrganisationDao extends JpaRepository<OrganisationVO, Integer>{
	
	List<OrganisationVO> findByOrganisationId(Integer organisationId);
	
	List<OrganisationVO> findByOrganisationType(String organisationType);
	
	OrganisationVO findByCode(String code);
}
