package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.util.EMUtil;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Krishan", "Male", 1200);
		Employee employee2 = new Employee("Radhna", "Female", 1300);
		Employee employee3 = new Employee("Balram", "Male", 1400);
		Employee employee4 = new Employee("Kans", "Male", 1500);
		Address emp1Add1 = new Address("Delhi", "Dwarka", "109653", "Home");
		Address emp1Add2 = new Address("Haryana", "Gurgaon", "763471", "Office");
		Address emp2Add1 = new Address("UttarPradesh", "Lucknow", "198651", "Home");
		Address emp2Add2 = new Address("Gujrat", "Indore", "109653", "Office");
		Address emp3Add1 = new Address("Bihar", "Dwarka", "109653", "Home");
		Address emp3Add2 = new Address("Uttarakhand", "Dwarka", "109653", "Office");
		Address emp4Add1 = new Address("Himachal", "Dwarka", "109653", "Home");
		Address emp4Add2 = new Address("Mizoram", "Dwarka", "109653", "Office");
		employee1.getEmpAddress().add(emp1Add1);
		employee1.getEmpAddress().add(emp1Add2);
		employee2.getEmpAddress().add(emp2Add1);
		employee2.getEmpAddress().add(emp2Add2);
		employee3.getEmpAddress().add(emp3Add1);
		employee3.getEmpAddress().add(emp3Add2);
		employee4.getEmpAddress().add(emp4Add1);
		employee4.getEmpAddress().add(emp4Add2);
		
		EntityManager entityManager = EMUtil.provideEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(employee4);
		entityManager.getTransaction().commit();
		System.out.println("Done...");
		
	}

}
