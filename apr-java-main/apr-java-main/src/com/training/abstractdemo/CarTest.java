package com.training.abstractdemo;

public class CarTest {
	
	public static void main(String[] args) {
		//absract class can't be instantiated
		//Car c = new Car();
		
		// sc is an instance variable
		//new SportsCar() returns the memory reference
		SportsCar sc = new SportsCar();
		
		// car is an instance varaible
		// abstract class instance 'car' can hold the child reference
		Car car = new SportsCar();
		car.start();
		car.drive();
	}

}
