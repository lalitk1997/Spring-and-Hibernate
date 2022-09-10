package com.day5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "account.getBalance", query="from Account where balance <:bal")
@NamedNativeQuery(name = "account.allAccounts", query = "Select * from Account", resultClass = Account.class)
public class Account  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accno;
	private String name;
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance="
				+ balance + "]";
	}

}
