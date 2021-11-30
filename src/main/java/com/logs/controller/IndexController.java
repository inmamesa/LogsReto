package com.logs.controller;

import java.lang.ModuleLayer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	
private final static Logger Logger= LoggerFactory.getLogger(IndexController.class);
	
	@GetMapping("/")
	public ResponseEntity<String> index()
	{
		Logger.info("Llamada al endpoint inicial.");
		return new ResponseEntity<String>(HttpStatus.OK).ok("hola");
	}
	@Value("${some.value}")
	private String myValue;
	
	@GetMapping("/myValue")
	public ResponseEntity<String> myValue()
	{
		Logger.info("Llamada al value.");
		return new ResponseEntity<String>(HttpStatus.OK).ok("hola");
	}

}
