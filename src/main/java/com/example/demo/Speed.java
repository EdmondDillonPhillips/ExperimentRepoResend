package com.example.demo;

import java.time.Duration;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

//import com.example.demo.ExperimentModel.Distance;
//import com.example.demo.ExperimentModel.DistanceUnit;


@Embeddable
public class Speed {
	 private Duration duration;
	 @Embedded
	 private Distance distance;
	 
	public Speed() {
		super();
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Distance getDistance() {
		return distance;
	}

	public void setDistance(Distance distance) {
		this.distance = distance;
	}
	
	
	 
	 
	}
	
