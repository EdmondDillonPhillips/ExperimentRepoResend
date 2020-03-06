package com.example.demo;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import ch.qos.logback.core.util.Duration;

@Entity
@Table(name="ExperimentModel")
public class ExperimentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String subjectName;
	
	@Transient
	private Speed speed;
	
	@Transient
	private Timestamp experimentTime;
	
	
	class Speed {
		 private Duration duration;
		 private Distance distance;
		}
		class Distance {
		 private DistanceUnit distanceUnit;
		 private Double unit;
		}
		enum DistanceUnit {
		 Millimeters,
		 Centimeters,
		 Meters,
		 Kilometers,
		 Inches,
		 Feet,
		 Yards,
		 Miles;
		}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
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
