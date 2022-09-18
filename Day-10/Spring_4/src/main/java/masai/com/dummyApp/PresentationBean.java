package masai.com.dummyApp;

public class PresentationBean {
	private ServiceBean service;
	
	public void display() {
		service.calculateInterest();
		System.out.println("All details are displayed at presentation layer...");
	}

	// Constructor
//	public PresentationBean(ServiceBean service) {
//		super();
//		this.service = service;
//	}

	// Setter
	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	
}
