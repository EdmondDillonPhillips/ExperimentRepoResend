package com.example.demo;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Embeddable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@SpringBootApplication
@EnableEurekaClient
@RestController
@Embeddable

public class ExperimentRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentRepoApplication.class, args);
	}
	
	@Autowired
	ExperimentDaoImpl repository;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@GetMapping("/hi")
	public String sayHello() {
		return "This is from the ExperimentRepo";
	}
	
	@GetMapping("/experiment")
	public List<ExperimentModel> getExperimentResults() throws SQLException{
		
		List<ExperimentModel> experimentList = repository.findAll();
		
		return experimentList;
	}
	
	@GetMapping("/experiment/{id}")
	public ExperimentModel getExperimentResults(@PathVariable("id") Long id) throws SQLException{
		
		ExperimentModel experiment = repository.getOne(id);
		
		return experiment;
	}
	
	@PostMapping(path = "/experiment", consumes = "application/json")
	public void addExperiment(@RequestBody ExperimentModel experiment) {
		
		System.out.println(experiment);
		repository.save(experiment);
	}
	
	
//	@GetMapping("/{id}")
//    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id) throws SQLException {
//        EmployeeEntity entity = service.getEmployeeById(id);
// 
//        return new ResponseEntity<EmployeeEntity>(entity, new HttpHeaders(), HttpStatus.OK);
//    }

}
