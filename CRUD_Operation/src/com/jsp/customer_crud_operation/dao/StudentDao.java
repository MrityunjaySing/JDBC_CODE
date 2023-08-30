package com.jsp.customer_crud_operation.dao;

/**
 * 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.jsp.customer_crud_operation.connection.StudentDatabaseConnection;
import com.jsp.customer_crud_operation.dto.Student;

public class StudentDao {

	Connection connection = StudentDatabaseConnection.getStudentDatabaseConnection();

	/*
	 * saveStudent method
	 */
	public Student saveStudentDao(Student student) {

		try {
			String insertStudentQuery = "insert into student values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertStudentQuery);

			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentEmail());
			preparedStatement.setString(4, student.getStudentPhone());
			preparedStatement.setObject(5, student.getStudentDob());

			preparedStatement.execute();

			System.out.println("Data--stored----");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return student;
	}

	/*
	 * getStudentById() method
	 */
	public Student getStudentByIdDao(int id) {
		String getOneStudentQuery = "SELECT * FROM student where id=?";
		Student student = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(getOneStudentQuery);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {

				student = new Student();
				int id1 = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String email = resultSet.getString("email");
				String phone = resultSet.getString("phone");

				LocalDate localDate = resultSet.getObject("dob", LocalDate.class);

				student.setStudentId(id1);
				student.setStudentName(name);
				student.setStudentEmail(email);
				student.setStudentPhone(phone);
				student.setStudentDob(localDate);
			}
			return student;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * delete method by student id
	 */
	public void deleteStudentByIdDao(int id) {
		String deleteQuery = "Delete FROM student where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
