package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class DocumentController {

	@Autowired
	DocumentService service;
	
	
	   private static final Logger logger = LoggerFactory.getLogger(DocumentController.class);
	@GetMapping("read")
	public String printData() {
		
		logger.info("read succesfully worked");
		logger.trace("hi am trace");
		return service.ReadData();
		
		
	}
}
