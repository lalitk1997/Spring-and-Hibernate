package masai.com.stereotype;

import org.springframework.stereotype.Service;

// Stereotype Annotations
// Service-Layer / Business Logic Layer
@Service(value = "a1")
public class A {
	public void funA() {
		System.out.println("Learning Spring-Boot!...");
	}
}
