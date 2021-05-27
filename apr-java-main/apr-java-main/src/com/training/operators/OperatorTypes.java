package com.training.operators;

public class OperatorTypes {
	public static void main(String[] args) {

		int count = 10;
		System.out.println(count--);// count = count--
		System.out.println(count); // increment
		System.out.println(-count);
		boolean isTrue = true;
		System.out.println(isTrue);
		System.out.println(!isTrue);
		System.out.println(~count);
		System.out.println("hello" + 100);
		System.out.println(6 & 3);// logical bitwise
		System.out.println(6 | 3);
		System.out.println(6 ^ 3);
		System.out.println(true & false);
		System.out.println(true && false); // logical (boolean expression or values)
//		System.out.println(6 && 3);
		System.out.println(count < 10 && true);// short circuit
		System.out.println(count < 10 || true);
		System.out.println(count);
		count += 15;// count = count + 15;
		System.out.println(count);
		System.out.println(6 << 1);// 12 = 6*(2^1) = operand * ( 2 ^ shift)
		System.out.println(6 >> 1);// 3 = 6/(2^1) = operand / ( 2 ^ shift)
		System.out.println(20 + 30 - -2 * (3 + 4) + 2 + 3 + "Good" + (5 * 2) + 3);

	}

}
