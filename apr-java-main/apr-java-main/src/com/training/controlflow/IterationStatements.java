package com.training.controlflow;

public class IterationStatements {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("=======================");
		i = 0;
		do {
			System.out.println("i = " + i);
			i++;
		} while (i < 10);
		System.out.println("========================");
		for (i = 0; i < 10; i++)
		    System.out.println(i);
		System.out.println("========================");


	}
}
