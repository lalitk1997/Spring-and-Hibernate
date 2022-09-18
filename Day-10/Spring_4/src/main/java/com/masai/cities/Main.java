package com.masai.cities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new AnnotationConfigApplicationContext(Config.class);
		A obj = (A)apx.getBean("classa");
		obj.printCities();
	}
}
