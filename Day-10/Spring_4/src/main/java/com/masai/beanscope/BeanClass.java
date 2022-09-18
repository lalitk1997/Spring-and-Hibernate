package com.masai.beanscope;

public class BeanClass {
	// Singleton Scope -> same bean for same ID
	// Prototype Scope -> separate bean classes every time 
	// (even for same ID)
	
	private String name;

	// Setter Injection
	public void setName(String name) {
		this.name = name;
	}
	
	// Displaying Data
	public void display() {
		System.out.println("display() inside BeanClass");
		System.out.println("Name : "+name);
	}
	
	
}
