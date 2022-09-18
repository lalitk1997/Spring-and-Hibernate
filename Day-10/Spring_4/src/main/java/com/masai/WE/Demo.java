package com.masai.WE;

 import org.springframework.context.ApplicationContext; 
 import org.springframework.context.support.ClassPathXmlApplicationContext; 
 public class Demo 
 { 
	 public static void main(String[] args) { 
		 ApplicationContext ctx= 
				 new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 A obj = ctx.getBean("a1",A.class); 
		 obj.funA(); 
		 } 
	 }