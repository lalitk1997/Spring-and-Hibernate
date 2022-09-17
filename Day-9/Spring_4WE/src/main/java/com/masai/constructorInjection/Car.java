package com.masai.constructorInjection;


public class Car implements Vehicle{

	public void drive() {
		System.out.println("Driving Car..... Zooooom!...");
	}
	public void start() {
		System.out.println("Start() : Vehicle Interface overriden on Car Class");
		drive();
	}
	
}
