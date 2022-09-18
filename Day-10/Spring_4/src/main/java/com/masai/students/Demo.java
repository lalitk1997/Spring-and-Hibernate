package com.masai.students;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new AnnotationConfigApplicationContext(Config.class);
		Z objZ = (Z) apx.getBean("clsz");
		objZ.display();
	}
}
