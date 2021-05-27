package com.training.arrays;

import com.training.methods.Car;

public class EvenNumber {
	public static void main(String[] args) {
		int[] numbers = new int[] { 100, 200, 300 };
		String[] names = new String[3];
		names[0] = "Vignesh";
		names[2] = "Reena";
		Car[] cars = new Car[3];
		cars[0] = new Car("AUDI", 200);
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

		for (int number : numbers) {
			System.out.println(number);
		}

		for (String name : names) {
			System.out.println(name);
		}

		for (Car car : cars) {
			System.out.println(car);
		}
	}
}
