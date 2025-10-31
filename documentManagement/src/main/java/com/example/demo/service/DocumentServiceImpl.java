package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class DocumentServiceImpl implements DocumentService{

	
	  private static final Logger logger = LoggerFactory.getLogger(DocumentServiceImpl.class);
	
	@Override
	public String ReadData() {
		return "data readed";
		
		
		
	
	}

	@Override
	public void ProcessData() {
		System.out.println("data processes");
		
	}

	@Override
	public String PrintData() {
		
		return "printing the data";
	}

}
