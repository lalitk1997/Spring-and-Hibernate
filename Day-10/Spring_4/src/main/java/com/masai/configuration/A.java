package com.masai.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Dependent Class
@Service
public class A {
	
	@Autowired
	private B b1;
	
	public void funA() {
		System.out.println("inside funA of A...!");
		System.out.println(b1);
	}
	
}
