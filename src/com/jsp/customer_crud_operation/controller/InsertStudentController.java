package com.jsp.customer_crud_operation.controller;

import java.time.LocalDate;

import com.jsp.customer_crud_operation.dto.Student;
import com.jsp.customer_crud_operation.service.StudentServices;

public class InsertStudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		StudentServices studentService = new StudentServices();

		Student student = new Student(112, "Mrityunjay", "satyamsingh24597@gmail.com", "9971409023",
				LocalDate.of(1999, 07, 12));

		studentService.saveStudentService(student);

		System.out.println("main method ended");
	}

}
