package com.training.carapp.service;

import java.util.List;

import com.training.carapp.dao.CarDAO;
import com.training.carapp.exception.CarNotFoundException;
import com.training.carapp.model.Car;

public class CarService {

//	private CarRepository carRepository;
	private CarDAO carDao;

	public CarService() {
		// carRepository = new CarRepository();
		carDao = new CarDAO();
	}

	public void createCar(Car car) {
		// carRepository.add(car);
		carDao.add(car);
	}

	public List<Car> findAllCars() {
//		return carRepository.findAll();
		return carDao.findAll();
	}

//	public Map<Integer, Car> findAllCars() {
//		return carRepository.findAll();
//	}
//
//	public Car findCarById(int id) throws CarNotFoundException {
//		Car car = carRepository.findById(id);
//		if (car == null) {
//			throw new CarNotFoundException("Car is not found");
//		} else {
//			return car;
//		}
//	}

	public Car findCarByModel(String model) throws CarNotFoundException {
		Car car = carDao.findByModel(model);
		if (car == null) {
			throw new CarNotFoundException("Car is not found");
		} else {
			return car;
		}
	}

	public void updateCar(Car car) {
//		carRepository.update(id, car);
		carDao.update(car);
	}

//
	public void deleteCar(String model) {
//		carRepository.delete(id);
		carDao.delete(model);
	}
}
