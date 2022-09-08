package day_1;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main implements EmployeeDao {
	

	@Override
	public String getAddressOfEmployee(int empId) {
		 System.out.println("getAddressOfEmployee(int empId)");
		// Persistence persistence = new Persistence();
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, empId);
		if(employee == null) {
			// System.out.println("Employee not exists!...");
			em.close();
			return "Employee not exists!...";
		}else {
			// System.out.println(employee);
			String employeeDeatils = employee.getAddress();
			em.close();
			return employeeDeatils;
		}
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		System.out.println("giveBounsToEmployee(empId, bonus)");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, empId);
		if(employee != null) {
			em.getTransaction().begin();
			int empSalary = employee.getSalary();
			employee.setSalary(empSalary + bonus);
			int updatedSalary = employee.getSalary();
			em.getTransaction().commit();
			return ("Updated salary :"+updatedSalary);
		}else {
			return ("Employee not exists!...");
		}
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em = emf.createEntityManager();
		Employee employee= em.find(Employee.class, empId);
		if(employee != null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			// System.out.println("");
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, empId);
		String[] empData = new String[2];
		if(employee != null) {
			empData[0] = employee.getName();
			empData[1] = employee.getAddress();
			return empData;
			// return ("Name : "+empName+" Address : "+empAddress);
		}else {
			empData[0] = null;
			empData[1] = null;
			return empData;
		}
	}


	public static void main(String args[]) {
		Main objMain = new Main();
		
		String message1 = objMain.getAddressOfEmployee(1);
		System.out.println(message1);
		String message2 = objMain.getAddressOfEmployee(3);
		System.out.println(message2);
		String message3 = objMain.getAddressOfEmployee(5);
		System.out.println(message3);
		String message4 = objMain.giveBonusToEmployee(1, 2000);
		System.out.println(message4);
		String message5 = objMain.giveBonusToEmployee(5, 2000);
		System.out.println(message5);
		if(objMain.deleteEmployee(1)) {
			System.out.println("employee deleted!...");
		}else {
			System.out.println("employee not exists!...");
		}
		if(objMain.deleteEmployee(5)) {
			System.out.println("employee deleted!...");
		}else {
			System.out.println("employee not exists!...");
		}
		String[] empData = objMain.getNameAndAddress(2);
		if(empData[0] != null) {
			System.out.println(Arrays.toString(empData));
		}else {
			System.out.println("employee not exists!...");
		}
	}

}
