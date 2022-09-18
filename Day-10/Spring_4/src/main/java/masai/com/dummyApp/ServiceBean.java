package masai.com.dummyApp;

public class ServiceBean {
	private DAOBean dao;
	
	public void calculateInterest() {
		dao.findAccount();
		System.out.println("Calculated Interest : 145xx");
	}

	// Constructor
//	public ServiceBean(DAOBean dao) {
//		super();
//		this.dao = dao;
//	}

	// Setter Method
	public void setDao(DAOBean dao) {
		this.dao = dao;
	}
	
	
}
