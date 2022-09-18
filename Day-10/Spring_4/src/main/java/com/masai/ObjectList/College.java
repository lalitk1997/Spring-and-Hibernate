package com.masai.ObjectList;

import java.util.List;

public class College {
	private String collegeName;
	private List<Student> students;

	// Setter Injection
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	// Constructor Injection
	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}

	// Getter Methods
	public String getCollegeName() {
		return collegeName;
	}
	public List<Student> getStudents(){
		return students;
	}
}
