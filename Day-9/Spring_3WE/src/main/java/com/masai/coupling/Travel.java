package com.masai.coupling;

public class Travel {
	Vehicle vehicle;
	
	public Travel() {
		
	}
	
	public Travel(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void letsGo() {
		vehicle.go();
		System.out.println("Journey Started!...");
	}
}
