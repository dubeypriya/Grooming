package com.db.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.operations.Operations;


@RestController
public class Controller {
	
	
	
	
@RequestMapping(value="/upload", method=RequestMethod.POST)
public void insertImage(@RequestParam(name="filepath", required=true) String filepath) throws IOException {
	Operations.insertExecute(filepath);
		
	}

@RequestMapping(value="/read", method=RequestMethod.POST)
public void readImage(@RequestParam(name="id", required=true) int id) throws IOException {
	Operations.readExecute(id);
		
	}
	
}



