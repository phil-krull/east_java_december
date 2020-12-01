package com.pkrull.oopdemo;

public class Car extends Vehicle {
	private int numWheels;
	
	public Car(int wheels) {
		numWheels = wheels;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
}
