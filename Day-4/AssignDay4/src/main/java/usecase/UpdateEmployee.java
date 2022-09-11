package usecase;

import java.util.Scanner;

import dao.EmployeeDaoImpl;
import dao.EmployeeException;
import model.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details of employee to be updated...");
		System.out.println("Enter empId : ");
		int empId = scanner.nextInt();
		System.out.println("Enter empName : ");
		String empName = scanner.next();
		System.out.println("Enter empAddress : ");
		String empAddress = scanner.next();
		System.out.println("Enter empSalary : ");
		int empSalary = scanner.nextInt();
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setName(empName);
		employee.setAddress(empAddress);
		employee.setSalary(empSalary);
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			objDaoImpl.updateEmployee(employee);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		System.out.println("Function Working...");
		scanner.close();
		
	}
}
