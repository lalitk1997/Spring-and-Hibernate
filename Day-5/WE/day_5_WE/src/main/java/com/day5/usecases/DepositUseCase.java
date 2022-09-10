package com.day5.usecases;

import java.util.Scanner;

import com.day5.dao.AccountDao;
import com.day5.dao.AccountDaoImpl;
import com.day5.model.Account;

public class DepositUseCase {
	
	public static void main(String[] args) {
		AccountDao dao=new AccountDaoImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number");
		int ano=sc.nextInt();
		Account acc= dao.findAccount(ano);
		if(acc == null)
			System.out.println("Account does not exist..");
		else{
			System.out.println("Enter the Amount to Deposit");
			int amt=sc.nextInt();
			acc.setBalance(acc.getBalance()+amt);
			boolean f =dao.updateAccount(acc);
			if(f)
				System.out.println("Deposited Sucessfully...");
			else
				System.out.println("Technical Error .....");
		}
		sc.close();
	}

}
