package com.kodewala.inheritance.q1;

public class Driver {
	public static void main(String[] args) {
		PermanentEmployee emp = new PermanentEmployee("EMP420","Ayush",50000,"Development",8);
		emp.showEmployeeDetails();
		emp.showPermanentEmployeeDetails();
		emp.displayAllowance();
	}
}
