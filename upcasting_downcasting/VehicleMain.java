package com.riya.upcasting_downcasting;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.start();
		
		v = new Car();
		v.start();
		
		Car c = (Car) v;
		c.carFeature();

	}

}
