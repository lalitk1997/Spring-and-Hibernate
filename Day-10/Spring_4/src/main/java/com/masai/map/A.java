package com.masai.map;

import java.util.Map;

public class A {
	private Map<Student, String> keyVal;

	// Setter Injection
	public void setKeyVal(Map<Student, String> keyVal) {
		this.keyVal = keyVal;
	}
	
	public void show() {
		System.out.println("inside showA of A");
		System.out.println(keyVal);
	}

	@Override
	public String toString() {
		return "A [keyVal=" + keyVal + "]";
	}
	
}
