package com.day5.usecase;

import java.util.Scanner;

import com.day5.dao.EmployeeDaoImpl;
import com.day5.dao.EmployeeException;

public class EmployeeSalary {
	public static void main(String[] args) {
		System.out.println("Enter employee id : ");
		Scanner scanner = new Scanner(System.in);
		int empId = scanner.nextInt();
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			int empSalary =  objDaoImpl.getEmployeeSalaryById(empId);
			System.out.println(empSalary);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		scanner.close();
		System.out.println("...");
	}
}
