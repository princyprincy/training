package com.training.primitives;

public class StringOperations {
	public static void main(String[] args) {

		String organization1 = "lion-bridge";
		String organization2 = new String("lion-bridge");
//		int number = 90;
		
		if(organization1 == organization2) { // not recommended for String equality check
			System.out.println("Both organizations are equal");
		}else {
			System.out.println("Both organizations are not equal");
		}
		
		if(organization1.equals(organization2)) { // recommended for String equality check
			System.out.println("Both organizations are equal");
		}else {
			System.out.println("Both organizations are not equal");
		}
		
		// 1. Convert to upper case
		// 2. Length of the string
		// 3. Check whether given char is present 
		// 4. Equal to null
		// 5. concat()
		
		System.out.println(organization1.toUpperCase());
		System.out.println(organization1.length());
		organization1 = organization1.toUpperCase();
		System.out.println(organization1.indexOf('I'));
		System.out.println(organization1==null);
		System.out.println(organization1.concat(" INDIA"));
	}

}
