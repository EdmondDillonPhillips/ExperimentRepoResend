package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ExperimentRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentRepoApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String sayHello() {
		return "This is from the ExperimentModel";
	}

}
