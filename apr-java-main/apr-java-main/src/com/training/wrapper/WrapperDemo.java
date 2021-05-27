package com.training.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		int sum = 0;
		for (String number : args) {
//			System.out.println(number);
			sum += Integer.parseInt(number);
		}
		System.out.println(sum);
		String output = String.valueOf(sum);
		System.out.println(output);
	}
}
