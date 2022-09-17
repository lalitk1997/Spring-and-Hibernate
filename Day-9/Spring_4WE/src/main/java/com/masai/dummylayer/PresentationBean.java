package com.masai.dummylayer;

public class PresentationBean {
	// Dependency Object
	private ServiceBean serviceBean;
	
	public void display() {
		serviceBean.calculateInterest();
		System.out.println("Data Displayed !!!!");
	}

	public PresentationBean(ServiceBean serviceBean) {
		super();
		this.serviceBean = serviceBean;
	}
	
	
	
	
}
