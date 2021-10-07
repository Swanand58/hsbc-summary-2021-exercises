package com.hsbc;

public class UI {
	public static void printVehicle(Vehicle vehicle) {
		vehicle.wheels();
		System.out.println("Mileage: "+vehicle.mileage());
		System.out.println("Engine: "+vehicle.engine());
	}
}
