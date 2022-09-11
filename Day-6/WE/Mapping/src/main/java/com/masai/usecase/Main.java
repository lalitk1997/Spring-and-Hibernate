package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.utiliy.EMUtil;

public class Main {
	public static void main(String[] args) {
		EntityManager entityManager = EMUtil.provideEntityManager();
		
		Employee employee1 = new Employee();
		employee1.setName("Ram");
		employee1.setSalary(7500);
		
		Employee employee2 = new Employee();
		employee2.setName("Ramesh");
		employee2.setSalary(7500);
		
		Department department = new Department();
		department.setDname("HR");
		department.setLocation("Kolkata");

		department.getEmps().add(employee1);
		department.getEmps().add(employee2);
		
		entityManager.getTransaction().begin();
		entityManager.persist(department);
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.getTransaction().commit();
	}
}
