package com.masai.cities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	
	@Bean("cities")
	public List<String> getCities(){
		List<String> cities = new ArrayList<>();
		cities.add("Delhi");
		cities.add("Gujrat");
		cities.add("West-Bengal");
		return cities;
	}
	
	@Bean("classa")
	public A getA() {
		return new A();
	}
}
