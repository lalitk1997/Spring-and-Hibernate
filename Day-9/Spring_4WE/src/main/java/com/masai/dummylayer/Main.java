package com.masai.dummylayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext apx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PresentationBean bean = (PresentationBean) apx.getBean("pre");
		bean.display();
	}
}
