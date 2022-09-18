package com.masai.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Z {
	@Autowired
	private List<Students> students;
	
	public void display() {
		System.out.println(students);
	}
}
