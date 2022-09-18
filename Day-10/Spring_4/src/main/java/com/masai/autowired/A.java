package com.masai.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class A {
	// By Type
	@Autowired
	@Qualifier("b1")
	private B b1;
	
	public void funA() {
		System.out.println("funA()...!");
		System.out.println(b1);
	}
}
