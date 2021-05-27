package com.training.carapp.test;

import java.util.List;
import java.util.Map;

import com.training.carapp.exception.CarNotFoundException;
import com.training.carapp.model.Car;
import com.training.carapp.service.CarService;

public class CarTest {
	public static void main(String[] args) {

		System.out.println("1.Create a New Car");
		CarService carService = new CarService();

		Car car = new Car();
		car.setModel("nano");
		car.setSpeed(100);
		carService.createCar(car);

//		Set<Car> cars = service.findAllCars();
//		for (Car c : cars) {
//			System.out.println(c);
//		}

		System.out.println("2.Find All Cars");
//		Map<Integer, Car> cars = carService.findAllCars();
//		for (Map.Entry<Integer, Car> c : cars.entrySet()) {
//			System.out.println(c.getKey() + ": " + c.getValue());
//		}
		List<Car> carList = carService.findAllCars();
		for (Car car2 : carList) {
			System.out.println(car2);
		}
//
//		System.out.println("3.Find A Car By Given Id");
//		int id = 50;
//
//		try {
//			Car foundCar = carService.findCarById(id);
//			System.out.println(foundCar);
//		} catch (CarNotFoundException e) {
//
//		}

		System.out.println("3.Find A Car By Given Model");
		String model = "audi";

		try {
			Car foundCar = carService.findCarByModel(model);
			System.out.println(foundCar);
		} catch (CarNotFoundException e) {

		}
//
		System.out.println("4.Update A Car By Given Id");
//		int updateId = 15;
		Car newCar = new Car();
		newCar.setModel("nano");
		newCar.setSpeed(150);
		carService.updateCar(newCar);
//
//		cars = carService.findAllCars();
//		for (Map.Entry<Integer, Car> c : cars.entrySet()) {
//			System.out.println(c.getKey() + ": " + c.getValue());
//		}
//
		System.out.println("5.Delete A Car By Given Id");
//		int deleteId = 3;
//		carService.deleteCar(deleteId);
		model = "nano";
		carService.deleteCar(model);

//		cars = carService.findAllCars();
//		for (Map.Entry<Integer, Car> c : cars.entrySet()) {
//			System.out.println(c.getKey() + ": " + c.getValue());
//		}
//
	}
}
