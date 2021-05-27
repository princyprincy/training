package com.training.datetime;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JdbcDateTime {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public JdbcDateTime() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void add() {
		int insertResult;
		String date = "6/5/1988";
		String dateTime = "6/5/1988 13:30";
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("M/d/yyyy H:m");
		try {
			pstmt = con.prepareStatement("insert into dummy values(?,?,?)");
			pstmt.setInt(1, 1);
			// LocalDate.parse - convert java string to java LocalDate
			// Date.valueOf - convert java LocalDate to sql Date
			pstmt.setDate(2, Date.valueOf(LocalDate.parse(date, dateFormat)));
			// LocalDateTime.parse - convert java string to java LocalDateTime
			// Timestamp.valueOf - convert java LocalDateTime to sql Timestamp
			pstmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.parse(dateTime, dateTimeFormat)));
			insertResult = pstmt.executeUpdate();
			System.out.println(insertResult + " records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		JdbcDateTime dao = new JdbcDateTime();
		dao.add();

	}

}
