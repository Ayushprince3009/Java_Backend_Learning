package com.kodewala.hashset.practicee.q17;

public class HotelRoomBooking {
	private String bookingId;
	private String guestName;
	private String hotelId;
	private int roomNumber;
	private String checkInDate;
	private String checkOutDate;
	private String roomType;
	
	public HotelRoomBooking(String bookingId, String guestName, String hotelId, int roomNumber, String checkInDate,
			String checkOutDate, String roomType) {
		super();
		this.bookingId = bookingId;
		this.guestName = guestName;
		this.hotelId = hotelId;
		this.roomNumber = roomNumber;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
	}
	
	@Override
	public int hashCode() {
		return roomNumber + (hotelId + checkInDate).hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		HotelRoomBooking book = (HotelRoomBooking)o;
		return this.roomNumber == book.roomNumber && this.hotelId.equals(book.hotelId)
				&& this.checkInDate.equals(book.checkInDate);
	}
	
}
