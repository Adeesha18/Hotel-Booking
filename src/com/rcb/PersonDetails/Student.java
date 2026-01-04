package com.rcb.PersonDetails;

public class Student extends PersonImpliment {
	String schoolName;
	int rollNum;

	public Student(String name, long mob, String schoolName, int rollNum) {
		super(name, mob);
		this.schoolName = schoolName;
		this.rollNum = rollNum;
	}

	public void checkIn() {
		System.out.println("Student Check In......");
	}

	public void checkOut() {
		System.out.println("Student Check Out......");
	}

	@Override
	public String toString() {
		return " Student Name :" + this.name + "\n Mobile Num :" + this.mob + "\n School Name :" + this.schoolName
				+ "\n Roll Num :" + this.rollNum;
	}

}
