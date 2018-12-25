package com.oscardeathrace.odrservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.oscardeathrace.repositories")
@ComponentScan(basePackages = {"com.oscardeathrace.controllers", "com.oscardeathrace.entities", 
		"com.oscardeathrace.facade", "com.oscardeathrace.transformers", "com.oscardeathrace.repositories",
		"com.oscardeathrace.validators"})
@EntityScan("com.oscardeathrace.entities")
public class OdrserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdrserviceApplication.class, args);
	}

}

