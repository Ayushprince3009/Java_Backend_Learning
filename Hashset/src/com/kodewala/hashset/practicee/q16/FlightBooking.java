package com.kodewala.hashset.practicee.q16;

public class FlightBooking {
	private String passengerId;
	private String passengerName;
	private String flightNumber;
	private String flightDate;
	private String seatNumber;
	private String airline;
	
	public FlightBooking(String passengerId, String passengerName, String flightNumber, String flightDate, String seatNumber, String airline) {
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.seatNumber = seatNumber;
		this.airline = airline;
	}
	
	@Override
	public int hashCode() {
		return (flightNumber + flightDate + seatNumber).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		FlightBooking f = (FlightBooking) obj;
		return this.flightNumber.equals(f.flightNumber)
				&& this.flightDate.equals(f.flightDate)
				&& this.seatNumber.equals(f.seatNumber);
	}
}
