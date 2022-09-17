package com.masai.constructorInjection;

public class Bike implements Vehicle {

	public void ride() {
		System.out.println("Riding Bike !.... Wooooooosh");
	}
	public void start() {
		System.out.println("Start() : Vehicle Inteface Overriden in Bike Class!..");
		ride();
	}
	
}
