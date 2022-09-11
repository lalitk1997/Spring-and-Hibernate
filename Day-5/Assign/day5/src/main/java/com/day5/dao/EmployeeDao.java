package com.day5.dao;

import java.util.List;

import com.day5.model.Employee;

public interface EmployeeDao {
	public Employee registerEmployee(Employee employee)throws EmployeeException;
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public Employee deleteEmployeeById(int empId) throws EmployeeException;
	public Employee updateEmployee(Employee employee)throws EmployeeException;
	public List<Employee> getAllEmployees() throws EmployeeException;
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary,int endSalary) throws EmployeeException;
	public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
	public int getEmployeeSalaryById(int empId)throws EmployeeException;
}
