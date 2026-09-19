package com.kodewala.multipleinterfaace.pq1;

public class Driver5 {
	public static void main(String[] args) {
		Doctor doctor = new Doctor("Ayush",50000);
		doctor.staffDetails();
		doctor.breakTime();
		doctor.performDuty();
		
	}
}

abstract class HospitalStaff{
	private String name;
	private double salary;
	
	public HospitalStaff(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void staffDetails() {
		System.out.println("Name:- "+getName());
		System.out.println("Salary:- "+getSalary());
	}
}

interface Duty{
	void performDuty();
	
	default void breakTime() {
		System.out.println("Break-Time");
	}
}

class Doctor extends HospitalStaff implements Duty {

	public Doctor(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void performDuty() {
		System.out.println("Doctor Performing Duty");
	}
}

class Nurse extends HospitalStaff implements Duty{

	public Nurse(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void performDuty() {
		System.out.println("Nurse is performing her duty");
	}
}