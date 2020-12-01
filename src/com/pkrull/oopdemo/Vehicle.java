package com.pkrull.oopdemo;

public class Vehicle {
	 // member variables
    private String color;
    private String type;
    // constructor
    public Vehicle() {
        color = "blue";
        type = "truck";
    }
    // method overloading
    public Vehicle(String type) {
        this.type = type;
    }
    public Vehicle(String type, String color) {
        this.type = type;
        this.color = color;
    }
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

  
}
