package com.masai.setterInjection;

public class Car implements Vehicle{

	public void drive() {
		System.out.println("Started Driving!...");
	}
	public void go() {
		System.out.println("Vehicle Interface Overriden in Car Class");
		drive();
	}
	
}
