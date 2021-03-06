package com.db.controller;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.operations.Operations;

@CrossOrigin
@RestController
public class Controller extends SpringBootServletInitializer{
	
	
	
	
@RequestMapping(value="/upload", method=RequestMethod.POST)
public void insertImage(@RequestParam(name="filepath", required=true) String filepath) throws IOException {
	Operations.insertExecute(filepath);
		
	}

@RequestMapping(value="/read", method=RequestMethod.POST)
public void readImage(@RequestParam(name="id", required=true) int id) throws IOException {
	Operations.readExecute(id);
		
	}
	
}



