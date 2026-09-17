package com.kodewala.hashset.practicee.q15;

public class EmployeeProject {
	private String employeeId;
	private String employeeName;
	private String projectId;
	private String projectName;
	private String role;
	
	public EmployeeProject(String employeeId,String employeeName, String projectId, String projectName, String role ) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.projectId = projectId;
		this.projectName = projectName;
		this.role = role;
	}
	
	@Override
	public int hashCode() {
		return (employeeId + projectId).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		EmployeeProject ep = (EmployeeProject) obj;
		return this.employeeId.equals(ep.employeeId)
				&& this.projectId.equals(ep.projectId);
	}
	
	
}
