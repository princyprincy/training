package com.training.methods;

public class CarTest {
	public static void main(String[] args) {

		Car car = new Car();
//		car.model = null;
//		car.speed = -90;
//		System.out.println(car.model);
//		car.setModel("FORD");
//		car.setSpeed(100);
		System.out.println(car);
//		System.out.println(car.toString());

		Car car1 = new Car("BENZ", 200);
		System.out.println(car1);

		Car car2 = car1;
		System.out.println(car2);

	}
}
