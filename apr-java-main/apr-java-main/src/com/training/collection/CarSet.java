package com.training.collection;

import java.util.HashSet;

import com.training.methods.Car;

public class CarSet {
	public static void main(String[] args) {
		HashSet<Car> cars = new HashSet<Car>();

		Car car1 = new Car("BMW", 150);
		Car car2 = new Car("Benz", 250);
		Car car3 = new Car("BMW", 150);
		Car car4 = new Car("Audi", 350);

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car3.hashCode());
		System.out.println(car4.hashCode());

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		System.out.println(cars.size());
	}

}
