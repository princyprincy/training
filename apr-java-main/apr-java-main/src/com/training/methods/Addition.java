package com.training.methods;

public class Addition {

	static void print() {
		System.out.println("undefined");
	}

	static void print(int a, int b) {
		System.out.println(a + b);
	}

	static int print(int a, int b, int c) {
		return a + b + c;
	}

	static String print(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	static Car print(Car car) {
		System.out.println(car);
		float newPrice = car.getPrice() + 1000000;
		car.setPrice(newPrice);
		return car;
	}

	static void print(Car[] cars) {
		for (Car car : cars) {
			System.out.println(car);
		}
	}
}
