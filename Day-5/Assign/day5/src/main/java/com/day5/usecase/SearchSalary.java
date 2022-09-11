package com.day5.usecase;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.day5.dao.EmployeeDaoImpl;
import com.day5.dao.EmployeeException;
import com.day5.model.Employee;

public class SearchSalary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startSalary = scanner.nextInt();
		int endSalary = scanner.nextInt();
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			List<Employee> employees =  objDaoImpl.getAllEmployeeWithRangeSalary(startSalary, endSalary);
			for(Employee emp : employees) {
				System.out.println(emp);
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		scanner.close();		
	}
}
