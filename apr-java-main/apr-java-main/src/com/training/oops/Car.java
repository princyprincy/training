package com.training.oops;

public class Car {

	// property syntax
	// access-specifier[optional] prop-type prop-name;
	private String model;
	private int speed;
//	private char type;

	// method syntax
	// access-specifier[optional] return-type method-name(param1-type
	// param1,param2-type param2..[optional]){
	// method-body
	// }
	public boolean start() {
		return true;
	}

	public byte accelarate() {
		return 10;
	}

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car);
		System.out.println(car.model);
		System.out.println(car.speed);
//		System.out.println(car.type);
		System.out.println(car.start());
		System.out.println(car.accelarate());

		System.out.println("Car Object After Instance Variable Initialization");
		car.model = "Aspire";
		car.speed = 200;
//		car.type = 'A';

		System.out.println(car.model);
		System.out.println(car.speed);
//		System.out.println(car.type);
		System.out.println(car.start());
		System.out.println(car.accelarate());
		System.out.println("=======================================================");
		Car car1 = null;
		car1 = new Car();
		System.out.println(car1);
		System.out.println(car1.model);
		System.out.println(car1.speed);
//		System.out.println(car1.type);

		System.out.println("Car1 Object After Instance Variable Initialization");
		car.model = "Amaze";
		car.speed = 300;
//		car.type = 'A';

		System.out.println(car.model);
		System.out.println(car.speed);
//		System.out.println(car.type);

		Car car2;
		car2 = car;
		System.out.println(car2);
	}
}
