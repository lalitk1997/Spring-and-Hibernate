package com.day5.usecase;

import java.util.Iterator;
import java.util.Scanner;

import com.day5.dao.EmployeeDaoImpl;
import com.day5.dao.EmployeeException;

public class EmployeeNameSalary {
	public static void main(String[] args) {
		System.out.println("Enter employee id : ");
		Scanner scanner = new Scanner(System.in);
		int empId = scanner.nextInt();
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			Object[] objects =  objDaoImpl.getEmployeeNameAndSalary(empId);
			for(Object ele:objects) {
				System.out.println(ele);
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		System.out.println("...");
	}
}
