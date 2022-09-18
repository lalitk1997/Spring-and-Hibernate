package com.masai.ObjectList;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext.xml");
		College collegeObj = (College) apx.getBean("college");
		List<Student> students = collegeObj.getStudents();
		String collegeName = collegeObj.getCollegeName();
		System.out.println(collegeName);
		for(Student s:students) {
			s.displayDetails();
		}
	}
}
