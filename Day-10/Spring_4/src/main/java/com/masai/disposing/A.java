package com.masai.disposing;

public class A {
	private String message;
	
	// Initializing a Bean
	public void init() {
		System.out.println("Initializing via int() method...");
	}
	
	// Disposing a Bean
	public void destroy() {
		System.out.println("Destrotying via destroy() method...");
	}
	
	public void display() {
		System.out.println("display() func called of inside Class A");
		System.out.println("Message : "+message);
	}
	// Setter Injection
	public void setMessage(String message) {
		this.message = message;
	}
	
}
