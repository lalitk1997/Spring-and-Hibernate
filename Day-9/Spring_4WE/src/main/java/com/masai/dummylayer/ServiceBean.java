package com.masai.dummylayer;

// DEPENDENT CLASS
public class ServiceBean {
	// Dependency Object
	private DAOBean daoBean;
	
	public void calculateInterest() {
		daoBean.findAccount();
		System.out.println("Total Interest Amt : 12x");
	}

	public ServiceBean(DAOBean daoBean) {
		super();
		this.daoBean = daoBean;
	}
	
	
}
