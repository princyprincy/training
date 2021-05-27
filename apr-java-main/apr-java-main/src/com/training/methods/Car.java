package com.training.methods;

public class Car {

	private String model;
	private int speed;
	private float price;

	public Car() {
		this("FORD",100);
		System.out.println("default constructor");
	}

	public Car(String model, int speed) {
//		this();
		this.model = model;
		this.speed = speed;
	}

	public Car(String model, int speed, float price) {
		this.model = model;
		this.speed = speed;
		this.price = price;
	}

	public Car(String model, float price) {
		this.model = model;
		this.price = price;
	}

	public Car(int speed, float price) {
		this.speed = speed;
		this.price = price;
	}
	public void setModel(String model) {
		if (model == null) {
			System.out.println("Invalid Model");
		} else {
			this.model = model;
		}
	}

	public String getModel() {
		return model;
	}

	public void setSpeed(int speed) {
		if (speed <= 0) {
			System.out.println("Invalid Speed");
		} else {
			this.speed = speed;
		}

	}

	public int getSpeed() {
		return speed;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", speed=" + speed + ", price=" + price + "]";
	}
	
	public void drive() {
		System.out.println("Undefined Car");
	}

//	public String toString() {
//		return model + ":" + speed;
//	}
}
