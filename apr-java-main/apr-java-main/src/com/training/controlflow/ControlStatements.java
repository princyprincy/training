package com.training.controlflow;

public class ControlStatements {
	public static void main(String[] args) {
		int count = 20;
		if (count == 10) {
			System.out.println("Yes it is 10");
		} else if (count == 20 ) {
			System.out.println("Yes it is 20");
			if (count > 10) {
				System.out.println("Yes it is > 10");
			}
		} 
		switch(count) {
		case 20:
			System.out.println("It is 20");
//			break;
		case 30:
			System.out.println("It is 30");
//			break;
		default:
			System.out.println("Default");
		}
		
	}
}
