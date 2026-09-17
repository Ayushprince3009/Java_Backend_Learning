package com.kodewalajenny.moieu.q2;

public class InPatient extends Patient{
	
	private double roomCharge;
	private int days;
	
	public InPatient(String patientId, String patientName, int age, double roomCharge, int days) {
		super(patientId, patientName, age);
		setRoomCharge(roomCharge);
		setDays(days);
		
	}

	public double getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(double roomCharge) {
		if(roomCharge < 0) {
			this.roomCharge = 0;
		}
		else {
			this.roomCharge = roomCharge;
		}
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		if(days < 2) {
			this.days = 1;
		}
		else {
			this.days = days;
		}
	}
	
}
