package com.shiv.model;

public class Student {

	private long studentId;
	private String studentName;
	private int age;
	private int marks;
	private String studentEmail;

	public Student() {
		super();
	}

	public Student(long studentId, String studentName, int age, int marks, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.studentEmail = studentEmail;
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", marks=" + marks
				+ ", studentEmail=" + studentEmail + "]";
	}
	
	

}
