package com.training.abstractdemo;

public abstract  class Car {

	// abstract method - method declaration - hiding method implementation
	abstract void start();
	abstract void stop();
	
	// concrete method - method definition/implementation
	void drive() {
		System.out.println("Drive cannot be defined");
	}
	
}
