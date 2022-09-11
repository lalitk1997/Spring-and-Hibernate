package com.day5.usecase;

import java.util.List;
import java.util.Scanner;

import com.day5.dao.EmployeeDaoImpl;
import com.day5.dao.EmployeeException;
import com.day5.model.Employee;

public class SearchEmployeeAddress {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Address to search...");
		 String empAddress = scanner.next();
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			List<Employee> employees =  objDaoImpl.getEmployeesByAddress(empAddress);
			for(Employee emp : employees) {
				System.out.println(emp);
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		 scanner.close();
		System.out.println("...");
	}
}
