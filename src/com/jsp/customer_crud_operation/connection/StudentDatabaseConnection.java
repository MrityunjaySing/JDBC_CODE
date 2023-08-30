package com.jsp.customer_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class StudentDatabaseConnection {
	public static Connection getStudentDatabaseConnection() {

		try {
//	    ==================== load driver =========================================
			Driver driver = new Driver();

//      ==================== create connection ====================================
			String url = "jdbc:mysql://localhost:3306/jspider";
			String user = "root";
			String pass = "root";

			Connection connection = DriverManager.getConnection(url, user, pass);
			return connection;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
