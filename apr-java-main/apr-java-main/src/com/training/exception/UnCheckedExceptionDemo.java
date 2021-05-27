package com.training.exception;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) throws NullPointerException {
//		try {
		// error prone code
//			int result = 5 / 0;
//			System.out.println(result);
//		} catch (ArithmeticException ae) {
//			 handler to the error prone code
//			System.out.println(ae.getMessage());
//			System.out.println(ae);
//			ae.printStackTrace();
//			System.out.println("Invalid Division");
//		}

//		try {
//			int[] numbers = { 1, 2, 3 };
//			System.out.println(numbers[10]);
//		} catch (ArrayIndexOutOfBoundsException aioe) {
//			aioe.printStackTrace();
//		}
//		try {
//			String name = null;
//			int result = 5 / 0;
//			System.out.println(name.length());//null.length()
//		} catch (ArithmeticException npe) {
//			System.out.println("Null Pointer Exception");
//		}
		try {
			String user = "lion";
			System.out.println(user.charAt(7));
		} 
		catch(StringIndexOutOfBoundsException siobe){
			System.out.println(siobe.getMessage());
		}
		finally {
			System.out.println("close the resources");
			System.out.println("end");
		}
	}

}
