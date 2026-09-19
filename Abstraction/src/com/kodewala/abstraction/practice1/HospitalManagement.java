package com.kodewala.abstraction.practice1;

import java.util.ArrayList;
import java.util.List;

public class HospitalManagement {
	public static void main(String[] args) {
		List<Doctor> list = new ArrayList<Doctor>();
		Doctor d1 = new Cardiologist("Ayush", 2000);
		Doctor d2 = new Dentist("Aditya", 900);
		Doctor d3 = new Neurologist("Ritesh",1500);
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		
		for(Doctor doctor : list) {
			System.out.println(doctor.getName() +" " + doctor.getConsultationFee());
		}
		//System.out.println(list);
		System.out.println(list.size());
		
		d1.treatPatient();
		d2.treatPatient();
		d3.treatPatient();
		
	}
}

abstract class Doctor{
	private String name;
	private double consultationFee;
	
	public Doctor(String name, double consultationFee) {
		this.name = name;
		this.consultationFee = consultationFee;
	}
	
	public String getName() {
		return name;
	}
	
	public double getConsultationFee() {
		return consultationFee;
	}
	
	abstract void treatPatient();
	
//	@Override
//	public String toString() {
//		return name;
//		
//	}
}

class Cardiologist extends Doctor{
	public Cardiologist(String name, double consultationFee) {
		super(name, consultationFee);
	}

	@Override
	void treatPatient() {
		System.out.println("Cardiologist treats heart disease");
	}
}

class Dentist extends Doctor{

	public Dentist(String name, double consultationFee) {
		super(name, consultationFee);
		// TODO Auto-generated constructor stub
	}

	@Override
	void treatPatient() {
		System.out.println("Dentist treats teeth problems");
	}
	
}

class Neurologist extends Doctor{

	public Neurologist(String name, double consultationFee) {
		super(name, consultationFee);
		// TODO Auto-generated constructor stub
	}

	@Override
	void treatPatient() {
		System.out.println("Neurologist treats nervous system problems");
		
	}
}