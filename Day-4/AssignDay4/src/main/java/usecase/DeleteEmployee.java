package usecase;

import java.util.Scanner;

import dao.EmployeeDaoImpl;
import dao.EmployeeException;

public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter empid (to delete employee) : ");
		int empId = scanner.nextInt();
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			objDaoImpl.deleteEmployeeById(empId);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		System.out.println("Function Completed....");
		scanner.close();
		
	}
}
