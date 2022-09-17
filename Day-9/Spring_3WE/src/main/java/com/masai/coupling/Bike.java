package com.masai.coupling;

public class Bike implements Vehicle{
	public void ride() {
		System.out.println("Riding Bike!...");
	}
	
	public void go() {
		ride();
	}
}
