package com.training.oops;

// Overloading
public class MethodDemo {

	public void print() {
		System.out.println("Hello World!!");
		return;
	}

	public void print(String msg) {
		System.out.println(msg);
	}

	public void print(Car car) {
		System.out.println(car);
	}

	public int print(int number) {
		System.out.println(number);
		return 0;
	}

	public void print(String firstName, String lastName) {
		System.out.println( firstName + lastName);
	}

	public static void main(String[] args) {
		MethodDemo demo = new MethodDemo();
		demo.print();
		demo.print(10);
		demo.print("Welcome to Java Training");
		Car c = new Car();
		demo.print(c);
		demo.print("Lion","Bridge");
		
	}

}
