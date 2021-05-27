package com.training.keyword;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getSpeed());
		car.setSpeed(10);
		System.out.println(car.getSpeed());
	}

}
