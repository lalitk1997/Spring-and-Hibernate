package com.masai.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 
import org.springframework.context.annotation.PropertySource; 
@Configuration 
@PropertySource("a1.properties") 
public class Config {
	
	@Bean("classa")
	public A getA() {
		return new A();
	}
}