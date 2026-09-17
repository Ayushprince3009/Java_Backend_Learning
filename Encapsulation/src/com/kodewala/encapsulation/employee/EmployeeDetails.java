package com.kodewala.encapsulation.employee;

public class EmployeeDetails {
	private String empId;
	private String name;
	private long salary;
	
	public EmployeeDetails(String empId, String name, long salary) {
		this.empId = empId;
		this.name = name;
		setSalary(salary);
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		if(salary > 0) {
			this.salary = salary;
		}
		else {
			this.salary = 0;
		}
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee Id:-"+ empId);
		System.out.println("Employee Name:-"+name);
		System.out.println("Salary:-"+salary);
	}
	
}
