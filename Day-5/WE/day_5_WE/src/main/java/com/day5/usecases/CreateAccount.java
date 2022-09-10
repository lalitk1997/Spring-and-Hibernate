package com.day5.usecases;
import java.util.Scanner;

import com.day5.dao.AccountDao;
import com.day5.dao.AccountDaoImpl;
import com.day5.model.Account;
public class CreateAccount {
	public static void main(String[] args) {
		AccountDao dao=new AccountDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Balance : ");
		int balance = sc.nextInt();
		Account acc1 = new Account();
		acc1.setName(name);
		acc1.setBalance(balance);
		dao.createAccount(acc1);
		System.out.println("Account Created.");
		sc.close();
	}
}
