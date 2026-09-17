package com.kodewala.inheritance.hospitalmanagementsystem;

public class Person {
	private String personId;
	private String personName;
	private int age;
	
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		if(personId == null || personId.isEmpty()) {
			this.personId = "XYZ123";
		}
		else {
			this.personId = personId;
		}
	}

	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		if(personName == null || personName.isEmpty()) {
			this.personName = "Unknown";
		}
		else {
			this.personName = personName;
		}
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}
		else {
			this.age = age;
		}
	}

	public Person(String personId, String personName, int age) {
		this.setPersonId(personId);
		this.setPersonName(personName);
		this.setAge(age);
	}

	public void showPersonDetails() {
		System.out.println("Person Id:- "+getPersonId());
		System.out.println("Person Name:- "+getPersonName());
		System.out.println("Age:- "+getAge());
		System.out.println();
	}
}

class Doctor extends Person{
	private String specialization;
	private int consultationFee;

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		if(specialization.isEmpty()) {
			this.specialization = "General";
		}
		else {
			this.specialization = specialization;
		}
	}

	public int getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(int consultationFee) {
		if(consultationFee < 0) {
			this.consultationFee = 0;
		}
		else {
			this.consultationFee = consultationFee;
		}
	}

	public Doctor(String personId, String personName, int age, String specialization, int consultationFee) {
		super(personId,personName,age);
		this.setConsultationFee(consultationFee);
		this.setSpecialization(specialization);
	}

	public void doctorDetails() {
		System.out.println("Doctor Details");
		showPersonDetails();
		System.out.println("Specialization:- "+getSpecialization());
		System.out.println("Consultation Fee:- "+getConsultationFee());
	}
	public void calculateDailyIncome(int patients) {
		double income = getConsultationFee() * patients;
		System.out.println("Today's Patients:- "+patients);
		System.out.println("Daily Income:- "+income);
	}	
}

class Patient extends Person{
	private String disease;
	private double roomCharge;
	
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		if(disease.isEmpty()) {
			this.disease = "Unknown";
		}
		else {
			this.disease = disease;
		}
	}

	public double getRoomCharge() {
		return roomCharge;
	}
	public void setRoomCharge(double roomCharge) {
		if(roomCharge < 100) {
			this.roomCharge = 100;
		}
		else {
			this.roomCharge = roomCharge;
		}
	}
	
	public Patient(String personId, String personName, int age, String disease, double roomCharge) {
		super(personId,personName,age);
		this.setDisease(disease);
		this.setRoomCharge(roomCharge);
	}

	public void showPatientDetails() {
		System.out.println();
		System.out.println("Patient Details");
		showPersonDetails();
		System.out.println("Disease:- "+getDisease());
		System.out.println("Room Charge:- "+getRoomCharge());	
	}
	
	public void calculateBill(int days) {
		double bill = days * getRoomCharge();
		System.out.println("Days Stayed:- "+days);
		System.out.println("Total Bill:- "+bill);
	}
}