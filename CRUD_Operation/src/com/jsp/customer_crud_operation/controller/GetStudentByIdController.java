package com.jsp.customer_crud_operation.controller;

import com.jsp.customer_crud_operation.dto.Student;
import com.jsp.customer_crud_operation.service.StudentServices;

public class GetStudentByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServices service = new StudentServices();

		Student student = service.getStudentByIdService(238);

		if (student != null) {

			System.out.println("studentid = " + student.getStudentId());
			System.out.println("studentName = " + student.getStudentName());
			System.out.println("studentEmail = " + student.getStudentEmail());
			System.out.println("studentPhone = " + student.getStudentPhone());
			System.out.println("studentDob = " + student.getStudentDob());
		} else {
			System.out.println("given id is not present ....");
		}
	}

}
