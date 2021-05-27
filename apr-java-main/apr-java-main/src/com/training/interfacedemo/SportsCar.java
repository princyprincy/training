package com.training.interfacedemo;

public class SportsCar implements Car {

	@Override
	public void start() {
		System.out.println("I am starting a sports car");
	}

	@Override
	public void drive() {
		System.out.println("I am driving a sports car");
	}
}
