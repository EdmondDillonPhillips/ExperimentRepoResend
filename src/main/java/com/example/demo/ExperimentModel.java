package com.example.demo;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ExperimentModel")
public class ExperimentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String subjectName;
	
	@Column
	private int speed;
	
	@Column
	private Timestamp experimentTime;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Timestamp getExperimentTime() {
		return experimentTime;
	}

	public void setExperimentTime(Timestamp experimentTime) {
		this.experimentTime = experimentTime;
	}

	@Override
	public String toString() {
		return "ExperimentModel [id=" + id + ", subjectName=" + subjectName + ", speed=" + speed + ", experimentTime="
				+ experimentTime + "]";
	}
	
	
	
}
