package com.kodewala.employeeTranser;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<String> employees = new ArrayList<>();

		employees.add("Amit");
		employees.add("Rahul");
		employees.add("Neha");
		employees.add("Amit");
		employees.add("Priya");
		employees.add("Rahul");
		employees.add("Karan");
		employees.add("Amit");
		
		employees.add(0,"Vikas");
		employees.add(4, "Pooja");
		employees.set(employees.indexOf("Neha"), "Anjali");
		System.out.println(employees.indexOf("Amit"));
		System.out.println(employees.lastIndexOf("Amit"));
		employees.remove(employees.indexOf("Amit"));
		employees.remove(employees.indexOf("Karan"));
		System.out.println(employees.contains("Rahul"));
		System.out.println(employees.contains("Priya"));
		System.out.println(employees.contains("Karan"));
		
		System.out.println(employees.get(0));
		System.out.println(employees.get(employees.size()-1));
		System.out.println(employees.size());
		
		employees.clear();
		System.out.println(employees.isEmpty());
		
	}
}
