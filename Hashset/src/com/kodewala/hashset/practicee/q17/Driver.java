package com.kodewala.hashset.practicee.q17;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<HotelRoomBooking> room = new HashSet<HotelRoomBooking>();
		
		HotelRoomBooking b1 = new HotelRoomBooking("B101", "Ayush", "H001", 205, "2026-09-10", "2026-09-12", "Deluxe");

		HotelRoomBooking b2 = new HotelRoomBooking("B102", "Rahul", "H001", 205, "2026-09-10", "2026-09-13", "Suite");

		HotelRoomBooking b3 = new HotelRoomBooking("B103", "Ayush", "H001", 206, "2026-09-10", "2026-09-12", "Deluxe");

		HotelRoomBooking b4 = new HotelRoomBooking("B104", "Ayush", "H001", 205, "2026-09-11", "2026-09-13", "Deluxe");

		HotelRoomBooking b5 = new HotelRoomBooking("B105", "Aman", "H002", 205, "2026-09-10", "2026-09-12", "Deluxe");

		HotelRoomBooking b6 = new HotelRoomBooking("B106", "Rohit", "H001", 206, "2026-09-10", "2026-09-15", "Suite");

		HotelRoomBooking b7 = new HotelRoomBooking("B107", "Neha", "H002", 205, "2026-09-10", "2026-09-14", "Suite");
		
		if(!(room.add(b1))){
			System.out.println("Duplicate: b1");
		}
		if(!(room.add(b2))){
			System.out.println("Duplicate: b2");
		}		
		if(!(room.add(b3))){
			System.out.println("Duplicate: b3");
		}
		if(!(room.add(b4))){
			System.out.println("Duplicate: b4");
		}
		if(!(room.add(b5))){
			System.out.println("Duplicate: b5");
		}
		if(!(room.add(b6))){
			System.out.println("Duplicate: b6");
		}
		if(!(room.add(b7))){
			System.out.println("Duplicate: b7");
		}
		
		System.out.println(room.size());
		
	}
}
