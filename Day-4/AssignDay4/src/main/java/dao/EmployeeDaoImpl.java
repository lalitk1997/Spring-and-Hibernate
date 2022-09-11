package dao;

import javax.persistence.EntityManager;

import model.Employee;
import utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee)throws EmployeeException {
		if(employee != null) {
			EntityManager entityManager = EMUtil.provideEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
			entityManager.close();
			return employee;
		}else {
			throw new EmployeeException("Please enter valid data!...");
		}
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		EntityManager entityManager = EMUtil.provideEntityManager();
		Employee employee =  entityManager.find(Employee.class, empId);
		entityManager.close();
		if(employee != null) {
			// System.out.println(employee);
			return employee;
		}else {
			throw new EmployeeException("Employee not exists...!");
		}
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager entityManager = EMUtil.provideEntityManager();
		Employee employee = entityManager.find(Employee.class, empId);
		// System.out.println(employee);
		if(employee != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			entityManager.close();
			return employee;
		}else {
			throw (new EmployeeException("Employee not exists!..."));
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		int empId = employee.getEmpId();
		String empName = employee.getName();
		String empAddress = employee.getAddress();
		int empSalary = employee.getSalary();
		EntityManager entityManager = EMUtil.provideEntityManager();
		Employee emp = entityManager.find(Employee.class, empId);
		if(emp != null) {
			entityManager.getTransaction().begin();
			emp.setName(empName);
			emp.setAddress(empAddress);
			emp.setSalary(empSalary);
			entityManager.getTransaction().commit();
			entityManager.close();
			return emp;
		}else {
			throw (new EmployeeException("Employee not exists!..."));
		}
	}
	
}
