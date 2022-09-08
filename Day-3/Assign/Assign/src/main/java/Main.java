import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main implements EmployeeDao {

	public void save(Employee emp) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		if(emp != null) {
			 entityManager.getTransaction().begin();
			 entityManager.persist(emp);
			 entityManager.getTransaction().commit();
			 entityManager.close();
			System.out.println("Employee updated!...");
		}else {
			System.out.println("Enter valid employee!...");
		}
		
	}

	public String getAddressOfEmployee(int empId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, empId);
		if(employee != null) {
			// System.out.println(employee);
			return (employee.getAddress());
		}else {
			return "Employee not exists!...";
		}
	}

	public String giveBonusToEmployee(int empId, int bonus) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, empId);
		if(employee != null) {
			entityManager.getTransaction().begin();
			employee.setSalary(employee.getSalary() + bonus);
			entityManager.getTransaction().commit();
			entityManager.close();
			return "Salary updated!...";
		}else {
			return "Employee not exists!...";
		}
	}

	public boolean deleteEmployee(int empId) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeeUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, empId);
		if(employee != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			entityManager.close();
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Main objMain = new Main();
		objMain.save(new Employee(4, "Tilak Rajkumar", "Chandigarh", 1200));
		objMain.save(new Employee(5, "Sagar Sharma", "Patel Nagar", 9000));
		System.out.println(objMain.getAddressOfEmployee(1));
		System.out.println(objMain.getAddressOfEmployee(3));
		System.out.println(objMain.getAddressOfEmployee(6));
		System.out.println(objMain.giveBonusToEmployee(1, 10000));
		System.out.println(objMain.giveBonusToEmployee(3, 9000));
		System.out.println(objMain.giveBonusToEmployee(10, 10000));
		System.out.println(objMain.deleteEmployee(1));
	}

}

