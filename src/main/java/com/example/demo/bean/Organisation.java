package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.OrganisationVO;

public class Organisation {
	
	public Integer organisationId;
	
	public String organisationType;
	
	public String code;

	public Integer getOrganisationId() {
		return organisationId;
	}

	public Organisation(Integer organisationId, String organisationType, String code, String name,
			Integer bussinessId, Integer patchArea) {
		super();
		this.organisationId = organisationId;
		this.organisationType = organisationType;
		this.code = code;
		this.name = name;
		this.bussinessId = bussinessId;
		this.patchArea = patchArea;
	}

	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setOrganisationId(Integer organisationId) {
		this.organisationId = organisationId;
	}

	public String getOrganisationType() {
		return organisationType;
	}

	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBussinessId() {
		return bussinessId;
	}

	public void setBussinessId(Integer bussinessId) {
		this.bussinessId = bussinessId;
	}

	public Integer getPatchArea() {
		return patchArea;
	}

	public void setPatchArea(Integer patchArea) {
		this.patchArea = patchArea;
	}

	public String name;
	
	public Integer bussinessId;
	
	public Integer patchArea;
	
	public static Organisation map(OrganisationVO resultVO) {
		Organisation result = new Organisation();
		result.setOrganisationType(resultVO.getOrganisationType());
		result.setCode(resultVO.getCode());
		result.setName(resultVO.getName());
		result.setBussinessId(resultVO.getBussinessId());
		result.setPatchArea(resultVO.getPatchArea());
		result.setOrganisationId(resultVO.getOrganisationId());
		return result;
	}
	
	public static List<Organisation> mapToList(List<OrganisationVO> resultVO) {
		List<Organisation> result = new ArrayList<>();
		resultVO.forEach(x -> {
			result.add(Organisation.map(x));
		});
		return result;
	}
}
