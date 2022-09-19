package com.masai.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new AnnotationConfigApplicationContext(Config.class);
		A obj = (A)apx.getBean("classa");
		obj.funA();
		
	}
}
