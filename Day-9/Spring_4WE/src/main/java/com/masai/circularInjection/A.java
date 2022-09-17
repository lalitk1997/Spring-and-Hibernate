package com.masai.circularInjection;

public class A {
	
	// Dependency Object
	B objB;
	
	
	public void printB() {
		System.out.println("print() method of class A");
		System.out.println(objB);
	}
	
	// Constructor
	public A(B objB) {
		super();
		this.objB = objB;
	}
	
}
