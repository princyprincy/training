package com.training.controlflow;

public class TransferStatements {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println("i = " + i);
//				break;
			if (i > 2) {
				continue;
			}

		}
	}
}
