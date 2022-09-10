package com.day5.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.day5.dao.AccountDaoImpl;
import com.day5.model.Account;
import com.day5.utility.EMUtil;

public class JPAUseCases {
	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEntityManager();
		
//		String query1 = "Select a from Account a";
//		Query q1 = em.createQuery(query1);
//		List<Account> list = q1.getResultList();
//		for(Account acc:list) {
//			System.out.println(acc);
//		}
		
		System.out.println("------------------");
		
//		String query2 = "Select a from Account a where name = 'Radha'";
//		Query q2 = em.createQuery(query2);
//		List<Account> list2 = q2.getResultList();
//		for(Account acc:list2) {
//			System.out.println(acc);
//		}
		
		System.out.println("------------------");
		
//		String query = "Select a from Account a where a.accno = 1";
//		Query q = em.createQuery(query);
//		Object accObj = q.getSingleResult();
//		Account account = (Account) accObj;
//		System.out.println(account);	
		
		System.out.println("------------------");
		
		// Typed Query
//		String query = "Select a from Account a where a.accno = 1";
//		TypedQuery<Account> tq = em.createQuery(query, Account.class);
//		Account account = tq.getSingleResult();
//		System.out.println(account);
		
		System.out.println("------------------");
		
		// Update Query
//		String query = "Update Account set balance = balance + 500";
//		Query tQuery = em.createQuery(query);
//		em.getTransaction().begin();
//		int x = tQuery.executeUpdate();
//		em.getTransaction().commit();
//		System.out.println(x+" Rows Updated...");
		
		System.out.println("------------------");
		
		// Update via Setting Parameters
//		String query = "Update Account set balance = ?1 where name = ?2";
//		Query q = em.createQuery(query);
//		q.setParameter(1, 2999);
//		q.setParameter(2, "Lalit");
//		em.getTransaction().begin();
//		int x = q.executeUpdate();
//		em.getTransaction().commit();
//		System.out.println(x+" Row Updated...");
		
		System.out.println("------------------");
		
		// Update via Named Parameters
//		String query = "Update Account set balance = :bal where name = :nam";
//		Query q = em.createQuery(query);
//		q.setParameter("bal", 4321);
//		q.setParameter("nam", "Kisan");
//		em.getTransaction().begin();
//		int x = q.executeUpdate();
//		em.getTransaction().commit();
//		System.out.println(x+" Row Updated...");
		
		System.out.println("------------------");
		
		// Implementing SELECT 
//		String query = "Select a from Account a";
//		TypedQuery<Account> typedQuery = em.createQuery(query, Account.class);
//		
//		List<Account> list = typedQuery.getResultList();
//		for(Account acc:list) {
//			System.out.println(acc);
//		}
		
		System.out.println("------------------");
		
		// 1 ROW 1 COLUMN --> Single Value Typed Query
//		String query = "Select name from Account a where a.accno = 3";
//		TypedQuery<String> typedQuery = em.createQuery(query, String.class);
//		String name = typedQuery.getSingleResult();
//		System.out.println("Username : "+name);
		
		// 1 ROW 1 COLUMN --> Single Value Simple Query
//		String query = "Select name from Account a where a.accno = 3";
//		Query q = em.createQuery(query);
//		Object object = q.getSingleResult();
//		System.out.println((String)object);
		
		System.out.println("------------------");
		
		// N Rows 1 Column
//		String query = "Select name from Account";
//		Query q = em.createQuery(query);
//		List<String> list = q.getResultList();
//		System.out.println(list);
		
		System.out.println("------------------");
		
		// N Rows M Columns
//		String query = "Select name, balance from Account";
//		Query q = em.createQuery(query);
//		List<Object[]> list = q.getResultList();
//		for(Object[] ele:list) {
//			String name = (String)ele[0];
//			int balance = (Integer)ele[1];
//			System.out.println("Name : "+name+" Balance : "+balance);
//		}
		
		System.out.println("------------------");
		
		// 1 Row N Column
//		String query = "Select name, balance from Account where accno = 1";
//		Query q = em.createQuery(query);
//		Object obj = q.getSingleResult();
//		Object[] objects = (Object[])obj; //DOUBT
//		System.out.println((String)objects[0]);
//		System.out.println((Integer)objects[1]);
		
		System.out.println("------------------");
		
		// Aggregate Func -> Sum
//		String query= "Select sum(balance) from Account";
//		Query q = em.createQuery(query);
//		Object obj =  q.getSingleResult();
//		System.out.println("Total Balance : "+(Long)obj);
		
		System.out.println("------------------");
		
		//Using Named Query
//		Query query = em.createNamedQuery("account.getBalance");
//		query.setParameter("bal", 100000);
//		List<Account> list = query.getResultList();
//		for(Account acc:list) {
//			System.out.println(acc);
//		}
		
		System.out.println("------------------");
		
		// Using Native Query
//		String query = "Select * from Account";
//		Query q = em.createNativeQuery(query, Account.class);
//		List<Account> list = q.getResultList();
//		for(Account acc:list) {
//			System.out.println(acc);
//		}
		
		System.out.println("------------------");
		
		// Using Named Native Query
//		Query query = em.createNamedQuery("account.allAccounts");
//		List<Account> list = query.getResultList();
//		for(Account acc:list) {
//			System.out.println(acc);
//		}

		System.out.println("------------------");
		
//		Account account = new Account();
//		account.setBalance(20000);
//		account.setName("Tilak");
//		EntityManager entityManager = EMUtil.provideEntityManager();
//		entityManager.getTransaction().begin();
//		entityManager.persist(account);
//		entityManager.getTransaction().commit();
		
		em.close();
	}
}
