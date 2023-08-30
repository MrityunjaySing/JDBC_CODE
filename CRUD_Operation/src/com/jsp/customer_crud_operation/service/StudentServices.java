package com.jsp.customer_crud_operation.service;

import com.jsp.customer_crud_operation.dao.StudentDao;
import com.jsp.customer_crud_operation.dto.Student;

public class StudentServices {
	StudentDao studentDao = new StudentDao();

	/**
	 *
	 * @param student
	 * @return
	 */
	public Student saveStudentService(Student student) {
		int id = student.getStudentId();
		if ((id > 99) && (id < 1000)) {
			studentDao.saveStudentDao(student);

		} else {
			System.out.println("please 3 digit");
		}
		return student;
	}

	/*
	 * getStudentById() method
	 */
	public Student getStudentByIdService(int id) {
		Student student = studentDao.getStudentByIdDao(id);
		return student;
	}

	/*
	 * delete method by student id
	 */
	public void deleteStudentByIdService(int id) {

		Student student = getStudentByIdService(id);

		if (student != null) {
			studentDao.deleteStudentByIdDao(id);
			System.out.println("Data deleted..");
		} else {
			System.out.println("given id is not found in table....");
		}
	}
}
