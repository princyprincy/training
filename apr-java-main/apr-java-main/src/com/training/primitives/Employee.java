package com.training.primitives;

public class Employee {
	public static void main(String[] args) {
		boolean isEmployee = true;
		System.out.println(isEmployee);
		int a; // declaring
		int b;
		a = 10; // assignment or initialization
		b = 10;
		int c;
		c = 30;
		String firstName = "lion";
		String lastName = "bridge";
//		String fullName = firstName +" "+ lastName;
		String fullName = firstName.concat(" "+lastName);
		System.out.println("Full name is " + fullName);
	}
}
