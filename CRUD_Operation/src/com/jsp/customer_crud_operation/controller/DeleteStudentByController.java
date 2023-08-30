package com.jsp.customer_crud_operation.controller;

import com.jsp.customer_crud_operation.service.StudentServices;

public class DeleteStudentByController {

	public static void main(String[] args) {
		StudentServices service = new StudentServices();

		service.deleteStudentByIdService(188);

	}

}
