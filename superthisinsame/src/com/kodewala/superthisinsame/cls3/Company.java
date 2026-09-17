package com.kodewala.superthisinsame.cls3;

public class Company {
	private String companyName;
	
	public Company(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
}

Class Employee extends Company{
	private String employeeName;
	
	public Employee(String companyName, String employeeName) {
		this.employeeName = employeeName;
	}
}
