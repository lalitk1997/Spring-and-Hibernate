package com.masai.coupling;

public class Main {
	public static void main(String[] args) {
		Travel travel = new Travel(new Car());
		travel.letsGo();
		Travel travel2 = new Travel(new Bike());
		travel2.letsGo();
		Travel travel3 = new Travel();
		travel3.setVehicle(new Car());
		travel3.letsGo();
	}
}
