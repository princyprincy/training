package com.training.exception;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws SQLException {
//			try {
				DriverManager.getConnection("dbname","user","password");
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				System.out.println(e);
//				System.out.println(e.getMessage());
//				System.out.println(e.getErrorCode());
//				e.printStackTrace();
//			}
//		
	}

}
