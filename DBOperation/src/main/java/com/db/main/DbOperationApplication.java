package com.db.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.db.controller"})
@SpringBootApplication
public class DbOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbOperationApplication.class, args);
	}

}
