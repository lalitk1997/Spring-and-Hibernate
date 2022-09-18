package com.masai.List;

import java.util.List;

public class A {
	private List<String> name;

	// Setter Injection
	public void setName(List<String> name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("inside show of Class A");
		System.out.println(name);
	}
	
	
}
