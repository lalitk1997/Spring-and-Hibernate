package com.masai.constructorInjection;

// Dependent Class
public class Travel {
	Vehicle vehicle;
	int numberOfPassenger;
	
	// Using Constructor (to resolve dependency)
	public Travel(Vehicle vehicle, int numberOfPassenger) {
		super();
		this.vehicle = vehicle;
		this.numberOfPassenger = numberOfPassenger;
	}
	
	public void journey() {
		System.out.println("journey() of Class Travel");
		vehicle.start();
		System.out.println("NumberOfPassenger : "+numberOfPassenger);
	}
	
}
