package com.training.wrapper;

public class CommandLineDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		for (String name : args) {
			if (name.length() > 7) {
				System.out.println(name);
			}
		}

	}

}
