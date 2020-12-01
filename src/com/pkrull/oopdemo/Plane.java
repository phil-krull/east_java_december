package com.pkrull.oopdemo;

public class Plane extends Vehicle {
	private Boolean wings;
	
	public Plane(Boolean wings, String type) {
		// calling the parent constructor
		super(type);
		
		this.wings = wings;
	}
	
	public void changePlaneColor(String color) {
		super.setColor(color);
	}

}
