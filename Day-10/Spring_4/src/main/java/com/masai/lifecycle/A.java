package com.masai.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	public B b1;
	
	@PostConstruct
	public void fun1() {
		System.out.println("fun1 setUp start initial");
	}
	
	@PreDestroy
	public void fun2() {
		System.out.println("fun2 tearDown end final");
	}
	
	public void funA() {
		System.out.println("Inside funA() of A...");
	}
	
}
