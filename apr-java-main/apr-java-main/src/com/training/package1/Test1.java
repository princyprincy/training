package com.training.package1;

public class Test1 {
	static public int publicVar;
	static protected int protectedVar;
	static int defaultVar;//default or package private
	static private int privateVar;
	public static void main(String[] args) {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
	}

}
