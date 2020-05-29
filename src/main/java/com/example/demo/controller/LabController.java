package com.example.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.BRBloodResult;
import com.example.demo.bean.Organisation;
import com.example.demo.service.LabBM;

@RestController
@RequestMapping(value = "/lab")
public class LabController {
	@Autowired
	LabBM service;

	@RequestMapping(value = "/create-lab", method = RequestMethod.POST)
	public ResponseEntity<?> createLab(@RequestBody Organisation organisation) {
		Integer labId = service.createLab(organisation);
		return new ResponseEntity<Integer>(labId, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/lab-details-by-labId/{labId}")
	public ResponseEntity<?> getLab(@PathVariable("labId") Integer labId) {
		return new ResponseEntity<Organisation>(Organisation.map(service.getLab(labId)), HttpStatus.OK);
	}

	@RequestMapping(value = "/getOrganisationByType/{type}")
	public ResponseEntity<?> getLab(@PathVariable("type") String type) {
		return new ResponseEntity<List<Organisation>>(Organisation.mapToList(service.getOrganisations(type)),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/upload-brBloodResult", method = RequestMethod.POST)
	public ResponseEntity<?> createBRBloodResult(@RequestBody BRBloodResult brBloodResult) {
		Integer activityId = service.createBRBloodResult(brBloodResult);
		return new ResponseEntity<Integer>(activityId, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/lab-details-by-activityId/{activityId}")
	public ResponseEntity<?> getBRBloodResult(@PathVariable("activityId") Integer activityId) {
		return new ResponseEntity<BRBloodResult>(BRBloodResult.map(service.getResult(activityId)), HttpStatus.OK);
	}

	@RequestMapping(value = "/download-lab-report")
	public ResponseEntity<Object> getReport() throws IOException {
		File file = service.downloadBT21Report();
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		HttpHeaders headers = new HttpHeaders();

		headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
		headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");

		return ResponseEntity.ok().headers(headers).contentLength(file.length())
				.contentType(MediaType.parseMediaType("application/pdf")).body(resource);
	}
}
