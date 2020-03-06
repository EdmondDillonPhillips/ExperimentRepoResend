package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


//@RepositoryRestResource
public interface ExperimentDaoImpl extends JpaRepository<ExperimentModel, Long> {

}
