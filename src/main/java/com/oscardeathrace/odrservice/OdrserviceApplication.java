package com.oscardeathrace.odrservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.oscardeathrace.controllers", "com.oscardeathrace.entities", 
		"com.oscardeathrace.facade"})
public class OdrserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdrserviceApplication.class, args);
	}

}

