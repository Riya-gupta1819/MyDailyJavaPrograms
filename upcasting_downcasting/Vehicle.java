package com.riya.upcasting_downcasting;

public class Vehicle {
	void start() {
		System.out.println("Vehical is start here");
	}

}

class Car extends Vehicle{
	void start() {
		System.out.println("Car is start");
	}
	void carFeature() {
		System.out.println("car features are there");
	}
}

