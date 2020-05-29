package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Organisation")
public class OrganisationVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "partyId")
	private Integer organisationId;
	
	@Column(name = "OrganisationType")
	private String organisationType;
	
	public OrganisationVO(Integer organisationId, String organisationType, String code, String name, Integer bussinessId,
			Integer patchArea) {
		super();
		this.organisationId = organisationId;
		this.organisationType = organisationType;
		this.code = code;
		this.name = name;
		this.bussinessId = bussinessId;
		this.patchArea = patchArea;
	}

	public OrganisationVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrganisationId() {
		return organisationId;
	}

	public void setId(Integer organisationId) {
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

	@Column(name = "Code")
	private String code;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "BussinessId")
	private Integer bussinessId;
	
	@Column(name = "fk_patchArea")
	private Integer patchArea;
}
