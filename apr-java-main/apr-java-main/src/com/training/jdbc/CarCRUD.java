package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CarCRUD {
	public static void main(String[] args) {
		try {
			// step1 load the driver class in memory
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.20:1521:EBS1228", "apps", "apps");
			
			// step3 create the statement object
//			Statement stmt = con.createStatement();
			int insertResult;
			int updateResult;
			int deleteResult;
			ResultSet rs ;
		
			// step4 execute query
//			rs = stmt.executeQuery("select * from CARS");
//			while (rs.next()) {
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
//			}
//			insertResult = stmt.executeUpdate("insert into CARS values(4,'KIA')");
//			updateResult = stmt.executeUpdate("update CARS set name='Audi A8' where id=3");
//			deleteResult = stmt.executeUpdate("delete from CARS where id=2");
//
//			System.out.println(insertResult + " records inserted");
//			System.out.println(updateResult + " records updated");
//			System.out.println(deleteResult + " records deleted");
//
//			rs = stmt.executeQuery("select * from CARS order by name");
//			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			System.out.println("========================================");
			PreparedStatement pstmt = con.prepareStatement("insert into CARS values(?,?)");
			pstmt.setInt(1, 101);// 1 specifies the first parameter in the query
			pstmt.setString(2, "NANO");
			insertResult = pstmt.executeUpdate();
			System.out.println(insertResult + " records inserted");

			pstmt = con.prepareStatement("update CARS set name=? where id=?");
			pstmt.setString(1, "Sonoo");// 1 specifies the first parameter in the query i.e. name
			pstmt.setInt(2, 3);
			updateResult = pstmt.executeUpdate();
			System.out.println(updateResult + " records updated");

			pstmt = con.prepareStatement("delete from CARS where id=?");
			pstmt.setInt(1, 4);
			deleteResult = pstmt.executeUpdate();
			System.out.println(deleteResult + " records deleted");

			pstmt = con.prepareStatement("select * from CARS");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			pstmt.close();
//			stmt.close();
//			// step5 close the connection object
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
