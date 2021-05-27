package com.training.inheritance;

import com.training.methods.Car;

public class SportsCar extends Car{
	
	public SportsCar(String model, int speed ) {
		super(model,speed);
	}

	public SportsCar() {
	}

	public void drive() {
		System.out.println("I am driving sports car");
	}
	
	public void drive(int initialSpeed) {
		System.out.println("I am driving sports car with a speed of "+ initialSpeed);
		
	}
	
	public void stop() {
	}
	
}
