package com.masai.autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("protoype")
public class B {
	public void funB() {
		System.out.println("funB()..!");
	}
}
