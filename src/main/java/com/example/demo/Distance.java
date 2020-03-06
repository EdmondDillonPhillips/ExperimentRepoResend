package com.example.demo;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Distance {
	
	
	 private DistanceUnit distanceUnit;
	 private Double unit;
	 
	public Distance() {
		super();
	}

	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}

	public void setDistanceUnit(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}

	public Double getUnit() {
		return unit;
	}

	public void setUnit(Double unit) {
		this.unit = unit;
	}
	
	
	 
	 
	}
	
