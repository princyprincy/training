package com.training.io;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the id");
		int id = scanner.nextInt();

		System.out.println("enter the name");
		String name = scanner.next();

		System.out.println("enter the array length");
		int length = scanner.nextInt();
		
		System.out.println("enter array elements");
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(id + ":" + name);
		for (int t : arr) {
			System.out.println(t);
		}
		
		System.out.println("Enter the choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Find All Employees");
			
			break;

		default:
			System.out.println("Sorry Invalid Choice");
			break;
		}
		
		scanner.close();
		
		

	}
}
