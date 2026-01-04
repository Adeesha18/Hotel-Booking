package com.rcb.HotelDetails;

import com.rcb.PersonDetails.*;
import java.util.HashMap;
import java.util.Scanner;

public class RegBook {

	Scanner sca = new Scanner(System.in);
	HashMap<Long, Person> hm = new HashMap<>();
	{
		hm.put(1234567890L, new Student("ABC", 1234567890L, "TSIXYZ", 123));
		hm.put(12345678911L, new Student("TRK", 12345678911L, "TYHASkI", 125));
		hm.put(12346377890L, new Employee("WBC", 12346377890L, "XYZzzz", 1203));
		hm.put(273345678911L, new Employee("WER", 273345678911L, "KJSHTYI", 1205));
	}

	void addPerson() {
		System.out.print("Enter Mobile Number :");
		long mob = sca.nextLong();
		if (!hm.containsKey(mob)) {
			System.out.print("Enter Name :");
			String name = sca.next();
			System.out.println("1) Student.\n2) Employee.\n ..Range 1 to 2....");
			int choise = sca.nextInt();
			if (choise == 1) {
				System.out.print("Enter Roll Number :");
				int roolNum = sca.nextInt();
				System.out.print("Enter School Name :");
				String sName = sca.next();
				sca.close();
				hm.put(mob, new Student(name, mob, sName, roolNum));
				System.out.println("Person Added Successfullly");
			} else if (choise == 2) {
				System.out.print("Enter Employee Id :");
				int eId = sca.nextInt();
				System.out.print("Enter Company Name :");
				String cName = sca.next();
				sca.close();
				hm.put(mob, new Employee(name, mob, cName, eId));
			} else {
				System.out.println("------Invalid Input------");
			}

		} else {
			System.out.println("Person Already Registered");
		}
	}

	public Person personDetails(long mob) {
		if (hm.containsKey(mob))
			return hm.get(mob);
		else
			return null;
	}

	void peopleList() {
		for (long key : hm.keySet()) {
			System.out.println(hm.get(key));
		}
	}

	boolean isPersomRegistered(long mob) {
		return hm.containsKey(mob);
	}
}
