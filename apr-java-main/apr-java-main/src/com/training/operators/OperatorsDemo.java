package com.training.operators;

public class OperatorsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Arithmetic Operators");
		System.out.println(a + b);
		if (a > 0) {
			System.out.println("a is positive");
		} else {
			System.out.println("b is negative");
		}
		System.out.println((a > 0) ? "positive" : "negative");
		// ==, !=, < ,> , <= , >=
		// && , || 
		// ++ , --
	}

}
