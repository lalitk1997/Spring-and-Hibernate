package com.masai.array;
import java.util.*;

public class A {
	private String[] names;
	
	// Setter Injection
	public void setNames(String[] names) {
		this.names = names;
	}
	
	// print function
	public void show() {
		System.out.println("inside showA of A");
		System.out.println(Arrays.toString(names));
	}
}
