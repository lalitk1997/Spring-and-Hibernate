package com.masai.ObjectList;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	
	// Constructor Injections
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public void displayDetails() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
	}
	
}
