package com.training.controlflow;

public class ForEachLoop {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 3, 40, 5, 60, 7 };
		int count = 0;
		System.out.println("Simple For Loop");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(i + "->" + numbers[i]);
				count++;
			}
		}
		System.out.println("Total even numbers " + count);
		System.out.println("For Each Loop");// not recommended for index based loops
		count = 0;
		for (int t : numbers) {
			if (t % 2 == 0) {
				System.out.println(t);
				count++;
			}
		}
		System.out.println("Total even numbers " + count);
	}
}
