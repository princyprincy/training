package com.training.primitives;

public class TypeConversion {
	public static void main(String[] args) {

		byte one = 1;
		byte two = 2;
//		byte three =  (one + two); // 8 bits = 32 bits
//		int three = one  + two; // 32 bits = 32 bits
		byte three = (byte) (one + two);
		System.out.println(three);

		int var1, var2;
		var1 = var2 = 10;

	}
}
