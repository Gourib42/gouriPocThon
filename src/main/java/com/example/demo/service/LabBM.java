package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.BRBloodResult;
import com.example.demo.dao.BRBloodResultDao;
import com.example.demo.model.BRBloodResultVO;

import com.example.demo.bean.Organisation;
import com.example.demo.dao.OrganisationDao;
import com.example.demo.exception.BRBloodResultNotFoundException;
import com.example.demo.exception.LabNotfoundException;
import com.example.demo.exception.OrganisationNotFoundException;
import com.example.demo.model.OrganisationVO;

@Service
public class LabBM {

	@Autowired
	BRBloodResultDao dao;

	@Autowired
	OrganisationDao organisationDao;
	
	 private static final Logger logger = LoggerFactory.getLogger(LabBM.class);

	public Integer createBRBloodResult(BRBloodResult resultInput) {
		OrganisationVO organisationVO = organisationDao.findByCode(resultInput.getLabNumber());

		if (Objects.isNull(organisationVO))
			throw new LabNotfoundException();

		BRBloodResultVO result = new BRBloodResultVO();
		result.setAnimalId(resultInput.getAnimalId());
		result.setConfirmStatus(resultInput.getConfirmStatus());
		result.setBarcode(resultInput.getBarcode());
		result.setBottleNumber(resultInput.getBottleNumber());
		result.setSat(resultInput.getSat());
		result.setWarmcft(resultInput.getWarmcft());
		result.setColdcft(resultInput.getColdcft());
		result.setIelisa(resultInput.getIelisa());
		result.setRbt(resultInput.getRbt());
		result.setResultStatus(resultInput.getResultStatus());
		result.setActivityId(resultInput.getActivityId());
		result.setLabId(organisationVO.getOrganisationId());
		logger.info("Save BRBloodResultVO successfull");
		return dao.save(result).getActivityId();
	}

	public BRBloodResultVO getResult(Integer activityId) {
		List<BRBloodResultVO> result = dao.findByActivityId(activityId);
		if (result.isEmpty())
			throw new BRBloodResultNotFoundException();
		else
			return result.get(0);
	}

	public Integer createLab(Organisation organisation) {
		OrganisationVO result = new OrganisationVO();
		result.setOrganisationType(organisation.getOrganisationType());
		result.setCode(organisation.getCode());
		result.setName(organisation.getName());
		result.setBussinessId(organisation.getBussinessId());
		result.setPatchArea(organisation.getPatchArea());
		logger.info("Save organisation successfull");
		return organisationDao.save(result).getOrganisationId();
	}

	public OrganisationVO getLab(Integer labId) {
		List<OrganisationVO> organisationVO = organisationDao.findByOrganisationId(labId);
		if (organisationVO.isEmpty())
			throw new LabNotfoundException();
		else
			return organisationVO.get(0);
	}

	public List<OrganisationVO> getOrganisations(String organisationType) {
		List<OrganisationVO> resultList = organisationDao.findByOrganisationType(organisationType);
		if (resultList.isEmpty())
			throw new OrganisationNotFoundException();
		else
			return resultList;
	}

	public File downloadBT21Report() throws IOException {
		String fileName = "reports/BT21.pdf";
		ClassLoader classLoader = new LabBM().getClass().getClassLoader();
		logger.info("Download BT21 Report successfull");
		return new File(classLoader.getResource(fileName).getFile());
	}

}
