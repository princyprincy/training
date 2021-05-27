package com.training.carapp.model;

public class Car {
	
	private String model;
	private int speed;

	public Car() {
		super();
	}

	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	public Car(int speed, String model) {
		super();
		this.model = model;
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
		return "Car [model=" + model + ", speed=" + speed + "]";
	}

}
