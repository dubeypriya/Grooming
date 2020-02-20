package com.db.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.db.controller"})
@SpringBootApplication
public class DbOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbOperationApplication.class, args);
	}

}
