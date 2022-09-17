package com.masai.setterInjection;

public class Bike implements Vehicle{

	public void ride() {
		System.out.println("Start Riding Bike!...");
	}
	public void go() {
		System.out.println("Vehicle Interface(go()) Overriden in Bike Class");
		ride();
	}
	
}
