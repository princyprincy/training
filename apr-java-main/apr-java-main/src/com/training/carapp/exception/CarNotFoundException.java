package com.training.carapp.exception;

public class CarNotFoundException extends Exception {

	public CarNotFoundException() {
		super();
	}

	public CarNotFoundException(String message) {
		System.out.println(message);
	}

}
