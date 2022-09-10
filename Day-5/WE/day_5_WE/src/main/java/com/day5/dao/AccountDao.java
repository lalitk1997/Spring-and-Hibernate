package com.day5.dao;

import com.day5.model.Account;

public interface AccountDao {
	
	public boolean createAccount(Account account);
	public boolean deleteAccount(int accno);
	public boolean updateAccount(Account account);
	public Account findAccount(int accno);

}