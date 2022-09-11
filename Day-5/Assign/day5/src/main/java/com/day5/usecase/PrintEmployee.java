package com.day5.usecase;

import java.util.List;

import com.day5.dao.EmployeeDaoImpl;
import com.day5.dao.EmployeeException;
import com.day5.model.Employee;

public class PrintEmployee {
	public static void main(String[] args) {
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			List<Employee> employees = objDaoImpl.getAllEmployees();
			for(Employee emp : employees) {
				System.out.println(emp);
			}
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		System.out.println("...");
	}
}
