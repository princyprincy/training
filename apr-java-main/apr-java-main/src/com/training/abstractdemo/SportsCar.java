package com.training.abstractdemo;

public class SportsCar extends Car {

	@Override
	void start() {
		System.out.println("I am starting a sports car");
	}

	@Override
	void stop() {
		System.out.println("I am stopping a sports car");
	}
	

	void drive() {
		System.out.println("I am driving a sport car");
	}
	
	

}
