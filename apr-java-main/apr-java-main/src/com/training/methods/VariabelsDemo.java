package com.training.methods;

public class VariabelsDemo {
	int a;
	static int b;
	final int c = 100;
	static final int d = 200;

	public static void main(String[] args) {
		VariabelsDemo demo = new VariabelsDemo();
		System.out.println(demo.a);
		System.out.println(b);
		System.out.println(demo.c);
//		demo.c = 1000;
//		d = 2000;
		System.out.println(d);
	}

}
