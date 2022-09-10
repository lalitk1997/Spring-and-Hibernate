package usecase;

import java.util.Scanner;

import dao.EmployeeDaoImpl;
import dao.EmployeeException;
import model.Employee;

public class SearchEmployee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter empid : ");
		int employeeId = scanner.nextInt();
		try {
			EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
			Employee emp = objDaoImpl.getEmployeeById(employeeId);
			System.out.println(emp);
		}catch (EmployeeException e) {
			System.out.println(e);
		}finally {
			scanner.close();	
		}
	}
}
