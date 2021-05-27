package com.training.operators;

public class Employee {
	public static void main(String[] args) {
		// Creation of an object employee
		Employee employee = new Employee();
		// (right hand expression - reference variable) reference for the employee will
		// be returned
		// (left hand variable - instance variable)
		System.out.println(employee);
		System.out.println(new Employee());
		
		if(employee instanceof Employee) {
			System.out.println("Yes!!");
		}else {
			System.out.println("No!!");
		}

	}
}
