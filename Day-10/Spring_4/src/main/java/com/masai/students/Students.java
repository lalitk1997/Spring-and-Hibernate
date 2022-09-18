package com.masai.students;

import org.springframework.stereotype.Service;

@Service
public class Students {
	
	private int roll;
	private String name;
	
	public Students(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + "]";
	}
	
	
	
	
}
