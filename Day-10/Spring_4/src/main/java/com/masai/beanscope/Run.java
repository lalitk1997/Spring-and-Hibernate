package com.masai.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		BeanClass obj = (BeanClass) apx.getBean("beanclass");
		BeanClass obj2 = (BeanClass) apx.getBean("beanclass");
		if(obj == obj2) {
			System.out.println("equal");
		}else {
			System.out.println("not-equal");
		}
//		obj.display();
	}
}
