package com.rcb.HotelDetails;

import java.util.Scanner;
import java.util.TreeMap;

import com.rcb.PersonDetails.Employee;
import com.rcb.PersonDetails.Person;
import com.rcb.PersonDetails.Student;

public class Hotel {

	static Scanner sca = new Scanner(System.in);
	static RegBook rb = new RegBook();
	static RoomDetails rooms = new RoomDetails();

	static TreeMap<Integer, Person> bookingDetails = new TreeMap<Integer, Person>();
	static {
		bookingDetails.put(11, null);
		bookingDetails.put(12, null);
		bookingDetails.put(13, null);
		bookingDetails.put(14, null);
		bookingDetails.put(15, null);
		bookingDetails.put(16, null);
		bookingDetails.put(17, null);
		bookingDetails.put(18, null);
		bookingDetails.put(19, rb.personDetails(1234567890L));
		bookingDetails.put(20, rb.personDetails(273345678911L));
		bookingDetails.put(21, null);
		bookingDetails.put(22, null);
		bookingDetails.put(23, null);
	}

	public static void main(String[] args) {

		while (true) {

			System.out.print(
					"1) Register.\n2) Room Book.\n3) Check out.\n4) Person Details.\n5) All Registered People List.\n"
							+ "6) Room Details.\n7) All Rooms Detail.\n8) Exit\nEnter Number : ");
			int n = sca.nextInt();
			switch (n) {
			case 1:
				rb.addPerson();

			case 2:
				Booking();
				break;

			case 3:
				System.out.print("Enter Room Number :");
				int roomNu = sca.nextInt();
				checkOut(roomNu);
				break;

			case 4:
				System.out.print("Enter Mobile Number :");
				long mob = sca.nextLong();
				System.out.println(rb.personDetails(mob));
				break;

			case 5:
				rb.peopleList();
				break;

			case 6:
				System.out.print("Enter Room Number :");
				int roomNum = sca.nextInt();
				System.out.println(rooms.RoomDetails(roomNum));
				System.out.println(bookingDetails.get(roomNum));
				break;

			case 7:
				allRoomDetails();
				break;

			case 8:
				return;

			default:
				System.out.println("...Invalid Input...");

			}
		}

	}

	public static void Booking() {
		availableRoomDetails();
		while (true) {
			System.out.print("Enter Roon Number :");
			int roomNum = sca.nextInt();
			if (bookingDetails.containsKey(roomNum)) {
				if (bookingDetails.get(roomNum) != null) {
					System.out.println("Room Already Booked,,.. Enter Another Room..");
				}
				System.out.print("Enter Mobile Number :");
				long mob = sca.nextLong();
				if (!rb.isPersomRegistered(mob)) {
					System.out.println("Peson Didnt registred plz Register First..");
					return;
				} else {
					bookingDetails.put(roomNum, rb.personDetails(mob));
					System.out.println("Room Number " + roomNum + " Booked Successfully...");
					bookingDetails.get(roomNum).checkIn();
					return;
				}
			} else {
				System.out.println("---Invalid Room Number----");
			}
		}
	}

	public static void availableRoomDetails() {
		String siRooms = "";
		String doRooms = "";
		int si = 0;
		int dou = 0;
		for (int room : bookingDetails.keySet()) {
			if (bookingDetails.get(room) == null) {
				if (rooms.roomType(room).equals("Single")) {
					si++;
					siRooms = siRooms + rooms.RoomDetails(room) + "\n";
				} else {
					dou++;
					doRooms = doRooms + rooms.RoomDetails(room) + "\n";
				}
			}
		}

		System.out.println("Single Available Rooms :" + si + "\n" + siRooms);
		System.out.println("Double Available Rooms :" + dou + "\n" + doRooms);
	}

	static void checkOut(int roomNum) {
		System.out.println(rooms.RoomDetails(roomNum));
		System.out.println(bookingDetails.get(roomNum));
		System.out.print("Confirm Check out [ Y / N ] :");
		String ch = sca.next().toUpperCase();
		if (ch.charAt(0) == 'Y') {
			Person p=bookingDetails.get(roomNum);
			bookingDetails.put(roomNum, null);
			p.checkOut();
			System.out.println("Successfully Checked Out");
		} else {
			return;
		}
	}

	static void allRoomDetails() {
		for (int roomNum : bookingDetails.keySet()) {
			System.out.println(rooms.RoomDetails(roomNum));
			System.out.println(bookingDetails.get(roomNum) + "\n");
		}
	}

}
