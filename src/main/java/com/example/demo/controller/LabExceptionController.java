package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.LabNotfoundException;
import com.example.demo.exception.BRBloodResultNotFoundException;
import com.example.demo.exception.OrganisationNotFoundException;

@ControllerAdvice
public class LabExceptionController {
	@ExceptionHandler(value = LabNotfoundException.class)
	   public ResponseEntity<Object> exception(LabNotfoundException exception) {
	      return new ResponseEntity<>("Lab not found", HttpStatus.NOT_FOUND);
	   }
	
	@ExceptionHandler(value = BRBloodResultNotFoundException.class)
	   public ResponseEntity<Object> exception(BRBloodResultNotFoundException exception) {
	      return new ResponseEntity<>("BR Blood Result details not found", HttpStatus.NOT_FOUND);
	   }
	
	@ExceptionHandler(value = OrganisationNotFoundException.class)
	   public ResponseEntity<Object> exception(OrganisationNotFoundException exception) {
	      return new ResponseEntity<>("Organisations not found", HttpStatus.NOT_FOUND);
	   }
}
