package com.training.inheritance;

import com.training.methods.Car;

public class Taxi extends Car{
	
	public Taxi(String model, int speed) {
		super(model,speed);
	}

	public Taxi() {
		// TODO Auto-generated constructor stub
	}

	public void drive() {
		System.out.println("I am driving taxi");
	}
}
