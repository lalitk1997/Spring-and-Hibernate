package com.masai.coupling;

public class Car implements Vehicle{
	public void drive() {
		System.out.println("Driving Car!...");
	}

	public void go() {
		drive();
	}
}
