package com.rcb.HotelDetails;

import java.util.TreeMap;

public class RoomDetails {
	static TreeMap<Integer, Room> rooms = new TreeMap<>();
	static {
		rooms.put(11, new Room(11, 1500.0, "Single"));
		rooms.put(12, new Room(12, 2000.0, "Double"));
		rooms.put(13, new Room(13, 1600.0, "Single"));
		rooms.put(14, new Room(14, 2100.0, "Double"));
		rooms.put(15, new Room(15, 1700.0, "Single"));
		rooms.put(16, new Room(16, 2200.0, "Double"));
		rooms.put(17, new Room(17, 1800.0, "Single"));
		rooms.put(18, new Room(18, 2300.0, "Double"));
		rooms.put(19, new Room(19, 1900.0, "Single"));
		rooms.put(20, new Room(20, 2400.0, "Double"));
		rooms.put(21, new Room(21, 2000.0, "Single"));
		rooms.put(22, new Room(22, 2500.0, "Double"));
		rooms.put(23, new Room(23, 2100.0, "Single"));
	}

	void allRoomsDetails() {
		for (int k : rooms.keySet()) {
			System.out.println(rooms.get(k));
		}
	}

	String RoomDetails(int roomNum) {
//			System.out.println(rooms.get(roomNum));
		return rooms.get(roomNum).toString();
	}

	String roomType(int roomNum) {
		return rooms.get(roomNum).type;
	}
}
