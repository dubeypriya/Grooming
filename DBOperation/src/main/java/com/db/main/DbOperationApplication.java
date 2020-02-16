package com.db.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.db.controller.Controller;

@SpringBootApplication
public class DbOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

}
