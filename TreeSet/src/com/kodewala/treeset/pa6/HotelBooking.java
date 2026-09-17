package com.kodewala.treeset.pa6;

import java.util.Set;
import java.util.TreeSet;

public class HotelBooking {
	public static void main(String[] args) {
		Set<Booking> booking = new TreeSet<Booking>();
		
		Booking b1 = new Booking(501, "Ayush", 101);
		Booking b2 = new Booking(502, "Rahul", 102);
		Booking b3 = new Booking(501, "Aman", 103);
		Booking b4 = new Booking(503, "Ravi", 104);
		Booking b5 = new Booking(504, "Ayush", 101);
		Booking b6 = new Booking(502, "Rohan", 105);
		
		booking.add(b1);
		booking.add(b2);
		booking.add(b3);
		booking.add(b4);
		booking.add(b5);
		booking.add(b6);
		
		System.out.println(booking.size());
		
	}
}

class Booking implements Comparable<Booking>{
	private int bookingId;
	private String name;
	private int roomNumber;
	
	public Booking(int bookingId, String name, int roomNumber) {
		this.bookingId = bookingId;
		this.name = name;
		this.roomNumber = roomNumber;
	}

	public int getBookingId() {
		return bookingId;
	}

	public String getName() {
		return name;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	@Override
	public int compareTo(Booking o) {
		int result = Integer.compare(this.getBookingId(), o.getBookingId());
		return result;
	}
	
	
}