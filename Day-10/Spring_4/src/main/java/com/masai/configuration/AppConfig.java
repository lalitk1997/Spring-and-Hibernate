package com.masai.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai.configurayion")
public class AppConfig {
	
	@Bean("a") 
	public A getA(){
		return new A();
	}
	
	@Bean public B getB(){ B b1=new B(); return b1; }
}
