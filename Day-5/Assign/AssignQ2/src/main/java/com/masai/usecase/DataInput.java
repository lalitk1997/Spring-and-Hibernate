package com.masai.usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.util.EMUtil;

public class DataInput {
	public static void main(String[] args) {
		EntityManager entityManager = EMUtil.provideEntityManager();
//		Scanner scanner = new Scanner(System.in);
		Address homeAddress1 = new Address("Delhi", "Dwarka", "122001", "Home");
		Address officeAddress1 = new Address("Haryana", "Gurgaon", "123101", "Office");
		Employee employee1 = new Employee();
		employee1.setName("Lalit");
		employee1.setGender("Male");
		employee1.setSalary(1200);
		employee1.getEmpAddress().add(officeAddress1);
		employee1.getEmpAddress().add(homeAddress1);
//		System.out.println(homeAddress1);
//		System.out.println(officeAddress1);
//		System.out.println(employee1);
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee1);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Done...");
	}
}
