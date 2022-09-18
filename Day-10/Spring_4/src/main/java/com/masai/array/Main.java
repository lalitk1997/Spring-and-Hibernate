package com.masai.array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		A objA = (A) apx.getBean("aid");
		objA.show();
	}
}
