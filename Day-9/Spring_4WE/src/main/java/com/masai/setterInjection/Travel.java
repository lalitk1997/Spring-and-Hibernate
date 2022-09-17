package com.masai.setterInjection;

//Dependent Class
public class Travel {
	// Object Type Dependency
	Vehicle v;
	// Simple Type
	int numberOfPerson;
	
	// Setter Methods of dependency-variables
	public void setV(Vehicle v) {
		this.v = v;
	}
	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}
	
	public void journey() {
		v.go();
		System.out.println("Journey is started...!");
		System.out.println("Number of person : "+numberOfPerson);
	}
	
}
