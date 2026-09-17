package com.kodewala.encapsulation.employee;

public class Driver {

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails("EMPTCS56EB3", "Ramesh Kumar", 45000);
		emp1.displayEmployeeDetails();
		System.out.println();
		
		EmployeeDetails emp2 = new EmployeeDetails("TCSMUH9876BG", "Suresh Kumar", 63279);
		emp2.displayEmployeeDetails();

	}

}
