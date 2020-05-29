package com.example.demo.bean;

import com.example.demo.model.BRBloodResultVO;

public class BRBloodResult {
	public Integer animalId;
	
	public String confirmStatus;
	
	public String barcode;
	
	public Integer bottleNumber;
	
	public String sat;
	
	public String warmcft;
	
	public String coldcft;
	
	public String ielisa;
	
	public String rbt;
	
	public String resultStatus;
	
	public Integer activityId;
	
	public String getLabNumber() {
		return labNumber;
	}

	public void setLabNumber(String labNumber) {
		this.labNumber = labNumber;
	}

	public Integer labId;
	
	public String labNumber;

	public Integer getLabId() {
		return labId;
	}

	public void setLabId(Integer labId) {
		this.labId = labId;
	}

	@Override
	public String toString() {
		return "BRBloodResult [animalId=" + animalId + ", confirmStatus=" + confirmStatus + ", barcode=" + barcode
				+ ", bottleNumber=" + bottleNumber + ", sat=" + sat + ", warmcft=" + warmcft + ", coldcft=" + coldcft
				+ ", ielisa=" + ielisa + ", rbt=" + rbt + ", resultStatus=" + resultStatus + ", activityId="
				+ activityId + ", labId=" + labId + "]";
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

	public BRBloodResult(Integer animalId, String confirmStatus, String barcode, Integer bottleNumber, String sat,
			String warmcft, String coldcft, String ielisa, String rbt, String resultStatus, Integer activityId, Integer labId) {
		super();
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

	public BRBloodResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static BRBloodResult map(BRBloodResultVO resultVO) {
		BRBloodResult result = new BRBloodResult();
		result.setAnimalId(resultVO.getAnimalId());
		result.setConfirmStatus(resultVO.getConfirmStatus());
		result.setBarcode(resultVO.getBarcode());
		result.setBottleNumber(resultVO.getBottleNumber());
		result.setSat(resultVO.getSat());
		result.setWarmcft(resultVO.getWarmcft());
		result.setColdcft(resultVO.getColdcft());
		result.setIelisa(resultVO.getIelisa());
		result.setRbt(resultVO.getRbt());
		result.setResultStatus(resultVO.getResultStatus());
		result.setActivityId(resultVO.getActivityId());
		result.setLabId(resultVO.getLabId());
		return result;
	}

}
