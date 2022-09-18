package com.masai.initializing;

public class A {
	private String message;

	// Setter Injection
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void mySetup() {
		System.out.println("inside mySetup() method.. initializing logic...!");
	}
	public void funA() {
		System.out.println("inside funA() method... of Class A");
	}
}
