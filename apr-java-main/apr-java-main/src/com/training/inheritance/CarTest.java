package com.training.inheritance;

import com.training.methods.Car;

public class CarTest {
	public static void main(String[] args) {
		SportsCar sportsCar = new SportsCar();
		sportsCar.setModel("Ferrai");
		sportsCar.setSpeed(200);
		sportsCar.setPrice(100000000);
		System.out.println(sportsCar);
		sportsCar.drive();
		sportsCar.drive(50);

		Taxi taxi = new Taxi();
		taxi.setModel("Maruti");
		taxi.setSpeed(100);
		taxi.setPrice(100000);
		System.out.println(taxi);
		taxi.drive();

		Car c = new Car();
		// parent instance can hold a child reference
		Car s = new SportsCar();
		// child instance can never hold parent reference
//		SportsCar ss = new Car();
		Car t = new Taxi();
		c.drive();
//		c.drive(100);
		s.drive();
		t.drive();

		if (c instanceof SportsCar) {
			System.out.println("c is a Car");
		}
		if (taxi instanceof Car) {
			System.out.println("taxi is a Car");
		}
		if (s instanceof Car) {
			System.out.println("s is a sports car");
		}

		Car[] cars = new Car[3];
		cars[0] = new Car("UNDEFINED", 0);
		cars[1] = new SportsCar("Ferrai", 100);
		cars[2] = new Taxi("Maruthi", 50);

		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
