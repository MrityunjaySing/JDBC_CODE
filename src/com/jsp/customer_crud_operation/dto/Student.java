package com.jsp.customer_crud_operation.dto;

import java.time.LocalDate;

public class Student {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentPhone;
	private LocalDate studentDob;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentEmail, String studentPhone, LocalDate studentDob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhone = studentPhone;
		this.studentDob = studentDob;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public LocalDate getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(LocalDate studentDob) {
		this.studentDob = studentDob;
	}

}
