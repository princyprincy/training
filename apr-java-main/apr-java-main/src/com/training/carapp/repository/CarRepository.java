package com.training.carapp.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.training.carapp.model.Car;

public class CarRepository {

//	private static Set<Car> cars;
	private static Map<Integer, Car> carMap;

	public CarRepository() {
//		cars = new HashSet<>();
		Car car1 = new Car("BMW", 150);
		Car car2 = new Car("Benz", 250);
		Car car3 = new Car("Hyundai", 100);
		Car car4 = new Car("Audi", 350);
//
//		cars.add(car1);
//		cars.add(car2);
//		cars.add(car3);
//		cars.add(car4);
		carMap = new HashMap<>();
		carMap.put(1, car1);
		carMap.put(2, car2);
		carMap.put(3, car3);
		carMap.put(4, car4);
	}

	public void add(Car car) {
//		cars.add(car);
		int id = carMap.size() + 1;
		carMap.put(id, car);
	}

//	public Set<Car> findAll() {
//		return cars;
//	}

	public Map<Integer, Car> findAll() {
		return carMap;
	}

	public Car findById(int id) {
		Car car = null;
		for (Map.Entry<Integer, Car> c : carMap.entrySet()) {
			if (c.getKey() == id) {
				car = c.getValue();
			}
		}
		return car;
	}

	public void update(int id, Car car) {
		for (Map.Entry<Integer, Car> c : carMap.entrySet()) {
			if (c.getKey() == id) {
				c.getValue().setSpeed(car.getSpeed());
			}
		}
	}

	public void delete(int id) {
		Iterator<Entry<Integer, Car>> it = carMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, Car> entry = it.next();
			if (entry.getKey() == id) {
				it.remove();
			}
		}

	}
}
