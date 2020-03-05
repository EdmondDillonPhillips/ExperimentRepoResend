package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperimentDaoImpl extends JpaRepository<ExperimentModel, Long> {

}
