package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	// getter and setter methods......
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setter injection started....setting up studentId");
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("setter injection started....setting up studentName");
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		System.out.println("setter injection started....setting up studentAddress");
		this.studentAddress = studentAddress;
	}

	// contructor............
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
