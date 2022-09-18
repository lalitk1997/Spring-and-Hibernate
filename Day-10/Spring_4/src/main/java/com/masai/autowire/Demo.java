package com.masai.autowire;

public class Demo {
	private A a1;
	private A a2;
	private B b1;
	
	public Demo() {
		System.out.println("inside 0 constructor argunment...!");
	}
	
	public Demo(B b1, A a1) {
		System.out.println("inside 2 constructor argunment...!");
	}
	
	public Demo(B b1, A a1, A a2) {
		System.out.println("inside 3 constructor argunment...!");
	}
	
	public void showDetails() {
		System.out.println("inside showDetails() func...!");
		System.out.println("b1 "+b1);
		System.out.println("a1 "+a1);
		System.out.println("a2 "+a2);
	}
}