package com.day5.dao;
import javax.persistence.EntityManager;
import com.day5.model.Account;
import com.day5.utility.EMUtil;

public class AccountDaoImpl implements AccountDao{	


	public boolean createAccount(Account account) {
		boolean flag= false;
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		flag=true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	public boolean deleteAccount(int accno) {
		boolean flag=false;
		EntityManager em= EMUtil.provideEntityManager();
		Account acc=em.find(Account.class, accno);
		if(acc != null){	
			em.getTransaction().begin();
			em.remove(acc);
			flag=true;
			em.getTransaction().commit();
		}
		em.close();
		return flag;
	}

	public boolean updateAccount(Account account) {
		boolean flag=false;
		EntityManager em= EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.merge(account);
		flag=true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	public Account findAccount(int accno) {
		return EMUtil.provideEntityManager().find(Account.class, accno);
	}
	
}
