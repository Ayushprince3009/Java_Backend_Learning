package com.kodewala.encapsulation.hospital;

public class PatientDetails {
	private String patientId;
	private String patientName;
	private String patientDisease;
	private int age;
	
	public PatientDetails(String id, String name, String disease, int age) {
		this.patientId = id;
		this.patientName = name;
		this.patientDisease = disease;
		setAge(age);
	}
	
	public String getName() {
		return patientName;
	}
	public void setName(String name) {
		this.patientName = name;
	}
	
	public String getId(){
		return patientId;
	}
	public void setId(String id) {
		this.patientId = id;
	}
	
	public String getDisease() {
		return patientDisease;
	}
	public void setDisease(String disease) {
		this.patientDisease = disease;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0 ) {
			this.age = age;
		}
		else {
			this.age = 0;
		}
	}
	
	public void displayPatientDetails() {
		System.out.println("Patient Id:- "+patientId);
		System.out.println("Patient Name:- "+patientName);
		System.out.println("Disease:- "+patientDisease);
		System.out.println("Age:- "+age);
		System.out.println();
	}
}
