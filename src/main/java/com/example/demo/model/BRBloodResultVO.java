package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BRBloodResult")
public class BRBloodResultVO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BRBloodResult")
	private Integer objectId;
	
	@Column(name = "fk_animalId")
	private Integer animalId;
	
	@Column(name = "ConfirmStatus")
	private String confirmStatus;
	
	@Column(name = "Barcode")
	private String barcode;
	
	@Column(name = "BottleNumber")
	private Integer bottleNumber;
	
	@Column(name = "Sat")
	private String sat;
	
	@Column(name = "Warmcft")
	private String warmcft;
	
	public BRBloodResultVO(Integer objectId, Integer animalId, String confirmStatus, String barcode,
			Integer bottleNumber, String sat, String warmcft, String coldcft, String ielisa, String rbt,
			String resultStatus, Integer activityId, Integer labId) {
		super();
		this.objectId = objectId;
		this.animalId = animalId;
		this.confirmStatus = confirmStatus;
		this.barcode = barcode;
		this.bottleNumber = bottleNumber;
		this.sat = sat;
		this.warmcft = warmcft;
		this.coldcft = coldcft;
		this.ielisa = ielisa;
		this.rbt = rbt;
		this.resultStatus = resultStatus;
		this.activityId = activityId;
		this.labId = labId;
	}

	public Integer getLabId() {
		return labId;
	}

	public void setLabId(Integer labId) {
		this.labId = labId;
	}

	public BRBloodResultVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getObjectId() {
		return objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	public String getConfirmStatus() {
		return confirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getBottleNumber() {
		return bottleNumber;
	}

	public void setBottleNumber(Integer bottleNumber) {
		this.bottleNumber = bottleNumber;
	}

	public String getSat() {
		return sat;
	}

	public void setSat(String sat) {
		this.sat = sat;
	}

	public String getWarmcft() {
		return warmcft;
	}

	public void setWarmcft(String warmcft) {
		this.warmcft = warmcft;
	}

	public String getColdcft() {
		return coldcft;
	}

	public void setColdcft(String coldcft) {
		this.coldcft = coldcft;
	}

	public String getIelisa() {
		return ielisa;
	}

	public void setIelisa(String ielisa) {
		this.ielisa = ielisa;
	}

	public String getRbt() {
		return rbt;
	}

	public void setRbt(String rbt) {
		this.rbt = rbt;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	@Column(name = "Coldcft")
	private String coldcft;
	
	@Column(name = "Ielisa")
	private String ielisa;
	
	@Override
	public String toString() {
		return "BRBloodResultVO [objectId=" + objectId + ", animalId=" + animalId + ", confirmStatus=" + confirmStatus
				+ ", barcode=" + barcode + ", bottleNumber=" + bottleNumber + ", sat=" + sat + ", warmcft=" + warmcft
				+ ", coldcft=" + coldcft + ", ielisa=" + ielisa + ", rbt=" + rbt + ", resultStatus=" + resultStatus
				+ ", activityId=" + activityId + ", labId=" + labId + "]";
	}

	@Column(name = "Rbt")
	public String rbt;
	
	@Column(name = "ResultStatus")
	public String resultStatus;
	
	@Column(name = "fk_activityId")
	public Integer activityId;
	
	@Column(name = "fk_LabId")
	private Integer labId;
	
}
