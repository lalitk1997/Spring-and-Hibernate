package com.day5.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.day5.model.Employee;

import day5com.day5.utility.EMUtil;



public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee)throws EmployeeException {
		if(employee != null) {
			EntityManager entityManager = EMUtil.provideEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
			System.out.println(employee);
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

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		String query = "Select e from Employee e";
		EntityManager entityManager = EMUtil.provideEntityManager();
		Query q = entityManager.createQuery(query);
		List<Employee> employees = q.getResultList();
		entityManager.close();
		if(employees.size() > 0) {
			return employees;
		}else {
			throw (new EmployeeException("Table empty!...."));
		}
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		EntityManager entityManager = EMUtil.provideEntityManager();
		String query = "Select e from Employee e where e.address = :addr";
		Query q = entityManager.createQuery(query);
		q.setParameter("addr", address);
		List<Employee> employees = q.getResultList();
		entityManager.close();
		if(employees.size() > 0) {
			return employees; 
		}else {
			throw (new EmployeeException("No Result!..."));
		}
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		EntityManager entityManager = EMUtil.provideEntityManager();
		String query = "Select e from Employee e where e.salary between :start AND :end";
		Query q = entityManager.createQuery(query);
		q.setParameter("start", startSalary);
		q.setParameter("end", endSalary);
		List<Employee> employees = q.getResultList();
		entityManager.close();
		if(employees.size() > 0) {
			return employees;
		}else {
			throw (new EmployeeException("No record exists!..."));
		}
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager entityManager = EMUtil.provideEntityManager();
		String query = "Select e.name, e.salary from Employee e where e.empId = :Id";
		Query q = entityManager.createQuery(query);
		q.setParameter("Id", empId);
		Object obj = q.getSingleResult();
		Object[] objects = (Object[])obj; // DOUBT
		entityManager.close();
		if(objects.length > 0) {
			return objects;
		}else {
			throw (new EmployeeException("No such employee exists!..."));
		}
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		EntityManager entityManager = EMUtil.provideEntityManager();
		Employee employee = entityManager.find(Employee.class, empId);
		if(employee != null) {
			String query = "Select e.salary from Employee e where e.empId = :Id";
			Query q = entityManager.createQuery(query);
			q.setParameter("Id", empId);
			Integer empSalary = (Integer)q.getSingleResult();
			entityManager.close();
			return empSalary;
		}else {
			throw (new EmployeeException("Employee not exists!..."));
		}
	}
	
}