package com.training.composition;

public class Car {
	private String model;
	private int speed;
	private Part part;

	public Car() {

	}

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void setPart(Part part) {
		this.part = part;
	}
	
	public Part getPart() {
		return part;
	}

	public String toString() {
		return "model : " + model + " speed : " + speed +" part :"+ part;
	}
}
