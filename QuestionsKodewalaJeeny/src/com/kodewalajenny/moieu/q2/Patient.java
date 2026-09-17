package com.kodewalajenny.moieu.q2;

public class Patient {
	private String patientId;
	private String patientName;
	private int age;
	
	public Patient(String patientId, String patientName, int age) {
		this.patientId = patientId;
		this.patientName = patientName;
		setAge(age);
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}else {
			this.age = age;
		}
	}
}
