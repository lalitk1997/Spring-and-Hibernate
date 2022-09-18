package com.masai.lazyandeagerinit;

public class D {
	private String msg;

	// Constructor Injection
	public D(String msg) {
		super();
		this.msg = msg;
	}
	// Bean Initialize Method
	public void initMessage() {
		System.out.println("Template Initialized...");
	}
	// Bean Destroy Method
	public void destroyMessage() {
		System.out.println("Template Destroyed...");
	}
	
	public void display() {
		System.out.println("display() method of class B");
		System.out.println("Message : "+msg);
	}
}
