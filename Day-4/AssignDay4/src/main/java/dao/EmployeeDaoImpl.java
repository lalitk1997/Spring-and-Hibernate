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
		if(employee != null) {
			System.out.println(employee);
		}else {
			throw new EmployeeException("Employee not exists...!");
		}
		return employee;
	}
	
}
