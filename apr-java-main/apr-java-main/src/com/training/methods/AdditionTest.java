package com.training.methods;

public class AdditionTest {

	public static void main(String[] args) {
		Addition.print();
		Addition.print(100, 200);
		System.out.println(Addition.print("G", "Mariappan"));
		System.out.println(Addition.print(100, 200, 300));

		Car car = new Car();
		System.out.println(Addition.print(car));
		
		
		String[] models  = {"FORD","AUDI","BMW"};
		int[] speeds = {100,200,300};
		Car[] cars = new Car[3];
		for(int i=0;i<cars.length;i++) {
			cars[i] = new Car(models[i],speeds[i]);
		}
		
		Addition.print(cars);

	}

}
