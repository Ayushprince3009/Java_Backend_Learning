package com.kodewala.hashset.practicee.q15;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<EmployeeProject> emp = new HashSet<EmployeeProject>();
		
		EmployeeProject e1 = new EmployeeProject("E101", "Ayush", "P501", "Banking", "Developer");
		EmployeeProject e2 = new EmployeeProject("E101", "Ayush Kumar", "P501", "Banking System", "Senior Developer");
		EmployeeProject e3 = new EmployeeProject("E101", "Ayush", "P502", "E-Commerce", "Developer");
		EmployeeProject e4 = new EmployeeProject("E102", "Rahul", "P501", "Banking", "Tester");
		EmployeeProject e5 = new EmployeeProject("E102", "Rahul Sharma", "P501", "Banking", "Senior Tester");
		EmployeeProject e6 = new EmployeeProject("E101", "Ayush", "P503", "CRM", "Developer");
		EmployeeProject e7 = new EmployeeProject("E102", "Rahul", "P502", "E-Commerce", "Tester");
		EmployeeProject e8 = new EmployeeProject("E101", "Ayush", "P502", "E-Commerce", "Senior Developer");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		
		System.out.println(emp.size());
		
	}
}
