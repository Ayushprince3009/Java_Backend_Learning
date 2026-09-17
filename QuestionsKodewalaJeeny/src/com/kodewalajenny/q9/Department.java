package com.kodewalajenny.q9;

public class Department extends University {
	private String departmentName;
	
	public Department(String universityName, String departmentName) {
		super(universityName);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
