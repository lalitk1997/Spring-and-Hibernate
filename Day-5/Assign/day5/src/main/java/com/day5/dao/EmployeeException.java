package com.day5.dao;

@SuppressWarnings("serial")
public class EmployeeException extends Exception{
	public EmployeeException(String errorMessage) {
		super(errorMessage);
	}
}
