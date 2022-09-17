package com.masai.circularInjection;

public class B {
	
	// Dependency Object
	A objA;
	
	public void printA() {
		System.out.println("printA() : of class B");
		System.out.println(objA);
	}

	// Constructor
	public B(A objA) {
		super();
		this.objA = objA;
	}
	
}
