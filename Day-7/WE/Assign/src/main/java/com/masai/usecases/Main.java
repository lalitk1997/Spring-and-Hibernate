package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.util.EMUtil;

public class Main {
	public static void main(String[] args) {
		EntityManager em = EMUtil.provideEntityManager();
		// Many to One
//		Department dept = new Department();
//		dept.setDname("Sales");
//		dept.setLocation("Mumbai");
//		
//		Employee emp1 = new Employee();
//		emp1.setName("Ram");
//		emp1.setSalary(7800);
//		emp1.setDept(dept);
//		
//		Employee emp2 = new Employee();
//		emp2.setName("Ramesh");
//		emp2.setSalary(8850);
//		emp2.setDept(dept);
//		
//		em.getTransaction().begin();
//		em.persist(emp1);
//		em.persist(emp2);
//		em.getTransaction().commit();
//		System.out.println("Done...");
//		em.close();
		
		// Fetching Data
//		Employee employee = em.find(Employee.class, 1);
//		Department dept = employee.getDept();
//		System.out.println(dept.getLocation());
//		System.out.println(dept.getDname());
//		System.out.println(dept.getDeptId());
		
		// Many to One bi-directional
		Department dept = new Department();
		dept.setDname("Sales");
		dept.setLocation("Mumbai");
		
		Employee emp1 = new Employee();
		emp1.setName("Ram");
		emp1.setSalary(7800);
		emp1.setDept(dept);
		
		Employee emp2 = new Employee();
		emp2.setName("Ramesh");
		emp2.setSalary(8850);
		emp2.setDept(dept);
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		System.out.println("Done...");
		em.close();
		 
		
	}
}
