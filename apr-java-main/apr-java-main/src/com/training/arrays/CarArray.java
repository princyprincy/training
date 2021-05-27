package com.training.arrays;

import com.training.methods.Car;

public class CarArray {

	public static void main(String[] args) {

		String[] models  = {"FORD","AUDI","BMW"};
		int[] speeds = {100,200,300};
		Car[] cars = new Car[3];
		for(int i=0;i<cars.length;i++) {
			cars[i] = new Car(models[i],speeds[i]);
		}
		
		for(Car car:cars) {
			System.out.println(car);
		}
		
		
	}

}
