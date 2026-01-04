package com.rcb.PersonDetails;

public class Employee extends PersonImpliment {
	String companyName;
	int eId;

	public Employee(String name, long mob, String companyName, int eId) {
		super(name, mob);
		this.companyName = companyName;
		this.eId = eId;
	}

	public void checkIn() {
		System.out.println("Employee Check In......");
	}

	public void checkOut() {
		System.out.println("Employee Check Out......");
	}

	@Override
	public String toString() {
		return " Employee Name :" + this.name + "\n Mobile Num :" + this.mob + "\n Company Name :" + this.companyName
				+ "\n Employee Id :" + this.eId;
	}
}
