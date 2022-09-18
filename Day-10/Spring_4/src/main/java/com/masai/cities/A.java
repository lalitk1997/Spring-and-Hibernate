package com.masai.cities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	private List<String> cities;
	
	public void printCities() {
		System.out.println(cities);
		System.out.println("cities");
	}
}
