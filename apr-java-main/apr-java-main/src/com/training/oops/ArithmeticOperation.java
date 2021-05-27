package com.training.oops;

public class ArithmeticOperation {
	private int number1;
	private int number2;

	public int add(int number3) {
		return number1 + number2 + number3;
	}

	public int sub(int  number3) {
		return number1 - number2 - number3;
	}

	public static void main(String[] args) {
		ArithmeticOperation operation = new ArithmeticOperation();
		operation.number1 = 10;
		operation.number2 = 5;
		System.out.println(operation.add(10));
		System.out.println(operation.sub(10));
	}
}
