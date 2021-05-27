package com.training.carapp.dao;

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
import java.util.ArrayList;
import java.util.List;

import com.training.carapp.model.Car;

public class CarDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public CarDAO() {
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
			pstmt.setDate(2, Date.valueOf(LocalDate.parse(date,dateFormat)));
			// LocalDateTime.parse - convert java string to java LocalDateTime
			// Timestamp.valueOf - convert java LocalDateTime to sql Timestamp
			pstmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.parse(dateTime,dateTimeFormat)));
			insertResult = pstmt.executeUpdate();
			System.out.println(insertResult + " records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void add(Car car) {
		int insertResult;
		try {
			pstmt = con.prepareStatement("insert into CARS values(?,?)");
			pstmt.setInt(1, car.getSpeed());
			pstmt.setString(2, car.getModel());
			insertResult = pstmt.executeUpdate();
			System.out.println(insertResult + " records inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Car> findAll() {
		List<Car> carList = new ArrayList<>();
		try {
			pstmt = con.prepareStatement("select * from CARS");
			rs = pstmt.executeQuery();
			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2));
				carList.add(new Car(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carList;

	}

	public Car findByModel(String model) {
		Car car = null;
		try {
			pstmt = con.prepareStatement("select * from CARS where model=?");
			pstmt.setString(1, model);
			rs = pstmt.executeQuery();
			while (rs.next()) {
//				System.out.println(rs.getInt(1) + " " + rs.getString(2));
				car = new Car(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return car;
	}

	public void update(Car car) {
		int updateResult;
		try {
			pstmt = con.prepareStatement("update CARS set speed=? where model=?");
			pstmt.setInt(1, car.getSpeed());// 1 specifies the first parameter in the query i.e. name
			pstmt.setString(2, car.getModel());
			updateResult = pstmt.executeUpdate();
			System.out.println(updateResult + " records updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//
	public void delete(String model) {
		int deleteResult;
		try {
			pstmt = con.prepareStatement("delete from CARS where model=?");
			pstmt.setString(1, model);
			deleteResult = pstmt.executeUpdate();
			System.out.println(deleteResult + " records deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CarDAO dao = new CarDAO();
		dao.add();
		
	}

}
