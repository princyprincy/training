package com.training.composition;

import com.training.exception.CarNameNotFoundException;

public class CarTest {
	public static void main(String[] args) throws CarNameNotFoundException {
		Car car = new Car();
		car.setModel("BMW");
		car.setSpeed(250);

		Part part = new Part();
		part.setId(100);
		part.setName("alloy wheel");
		car.setPart(part);
		
		Car audi = new Car();
		car.setModel("A3");
		car.setSpeed(300);
		car.setPart(part);

		System.out.println(car);

		Car car1 = new Car();
		String model = null;
		if (model != null) {
			car1.setModel(model);
		} else {
			throw new CarNameNotFoundException();
		}

		car1.setSpeed(300);

		Part part1 = new Part();
		part1.setId(200);
		part1.setName("wheel");
		car1.setPart(part1);

		System.out.println(car1);

	}

}
