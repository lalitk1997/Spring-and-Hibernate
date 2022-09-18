package com.masai.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean("clsz")
	public Z getZ() {
		return new Z();
	}
	
	@Bean("students")
	public List<Students> getStudents(){
		List<Students> students = new ArrayList<>();
		students.add(new Students(1, "Lalit"));
		students.add(new Students(2, "Raja"));
		students.add(new Students(3, "Mohan"));
		return students;
	}
	
	
}
