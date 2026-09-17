package com.kodewala.inheritance.hospitalmanagementsystem;

public class Driver {
	public static void main(String[] args) {
		Doctor dr = new Doctor("D101","DR.Sharma",56,"Cardiologist",800);
		dr.doctorDetails();
		dr.calculateDailyIncome(40);
		
		Patient p = new Patient("PT101","Suresh",35,"Fever",3400);
		p.showPatientDetails();
		p.calculateBill(5);
	}
}
