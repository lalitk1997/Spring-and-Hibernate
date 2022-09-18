package com.masai.disposing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		A objA = apx.getBean("classA", A.class);
		objA.display();
	}
}
