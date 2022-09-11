package com.day6.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.EntityManager;
import com.day6.utility.EMUtil;

public class Demo {
	public static void main(String args[]) {
		EntityManager em = EMUtil.provideEntityManager();
		
//		Address address1 = new Address("Haryana", "Gurgaon", "122001");
//		Address address2 = new Address("Delhi", "Dwarka", "321002");
//		Employee employee = new Employee();
//		employee.setEname("Lalit");
//		employee.setSalary(10000);
//		employee.setOfficeAddr(address1);
//		employee.setHomeAddr(address2);
//		em.getTransaction().begin();
//		em.persist(employee);
//		em.getTransaction().commit();
		
		
//		Employee emp=new Employee();
//		emp.setEname("Ram");
//		emp.setSalary(7800);
		
		
//		Employee emp= new Employee();
//		emp.setEname("Ramesh");
//		emp.setSalary(6800);
//		emp.getAddresses().add(new Address("Mh", "Pune", "787887","home"));
//		emp.getAddresses().add(new Address("MP", "Indore", "584542","office"));
//		em.getTransaction().begin();
//		em.persist(emp);
//		em.getTransaction().commit();
//		System.out.println("done...");
		

//		EntityManager entityManager = EMUtil.provideEntityManager();
//		String query = "from Employee where ename = 'Ramesh'";
//		Query q = entityManager.createQuery(query);
//		List<Employee> emps = q.getResultList();
//		for(Employee emp:emps) {
//			Set<Address> addrs= emp.getAddresses();
//			for(Address adr:addrs) {
//				System.out.println(adr);
//			}
//		}
		
		
		
		
		em.close();
	}
}
