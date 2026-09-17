/*Create an Employee class.

Create a default constructor.
Initialize:
name = "Unknown"
salary = 0
Print all values.
Create one object.*/

package com.kodewala.object.constructor.learning;

public class Employee {

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
	}
}

class EmployeeDetails{
	private String name;
	private int salary;
	
	EmployeeDetails(){
		name = "Unknown";
		salary = 0;
		System.out.println(name);
		System.out.println(salary);
	}
}
