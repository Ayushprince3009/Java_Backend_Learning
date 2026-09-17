package com.kodewala.hashset.practicee.q16;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<FlightBooking> fb = new HashSet<FlightBooking>();
		
		FlightBooking f1 = new FlightBooking("P101", "Ayush", "AI202", "2026-09-10", "12A", "AirIndia");
		FlightBooking f2 = new FlightBooking("P102", "Rahul", "AI202", "2026-09-10", "12A", "AirIndia");
		FlightBooking f3 = new FlightBooking("P101", "Ayush", "AI202", "2026-09-10", "12B", "AirIndia");
		FlightBooking f4 = new FlightBooking("P101", "Ayush", "AI202", "2026-09-11", "12A", "AirIndia");
		FlightBooking f5 = new FlightBooking("P103", "Aman", "AI303", "2026-09-10", "12A", "AirIndia");
		FlightBooking f6 = new FlightBooking("P104", "Rohit", "AI202", "2026-09-10", "12B", "AirIndia");
		FlightBooking f7 = new FlightBooking("P105", "Neha", "AI202", "2026-09-10", "13A", "AirIndia");
		
		System.out.println(fb.size());
		
		fb.add(f1);
		fb.add(f2);
		fb.add(f3);
		fb.add(f4);
		fb.add(f5);
		fb.add(f6);
		fb.add(f7);
		System.out.println(fb.size());
	}
}
