package masai.com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		A objA = (A) ctx.getBean("a1");
		objA.funA();
		System.out.println("Done!...");
	}
}
