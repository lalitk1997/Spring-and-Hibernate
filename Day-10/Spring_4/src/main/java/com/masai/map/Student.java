package com.masai.map;

import java.util.Objects;

public class Student {
	private int roll;
	private String name;
	private int marks;
	
	// Constructor Injection
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	// Display Details
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
		System.out.println("Roll : "+roll);
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
