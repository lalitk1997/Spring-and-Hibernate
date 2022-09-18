package com.masai.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo dObj = (Demo) apx.getBean("demo");
	}
}
