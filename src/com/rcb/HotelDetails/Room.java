package com.rcb.HotelDetails;

public class Room {
	int roomNum;
	double price;
	String type;

	Room(int roomNum, double price, String type) {
		this.roomNum = roomNum;
		this.price = price;
		this.type = type;
	}

	public String getRoomType() {
		return this.type;
	}

	public double getPrice() {
		return this.price;
	}

	public int roomNumber() {
		return this.roomNum;
	}

	@Override
	public String toString() {
		return "Room Number :" + this.roomNum + ", Type: " + this.type + ", Price: " + this.price;
	}

}
