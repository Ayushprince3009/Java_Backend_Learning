package com.kodewala.inheritance.q1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employee {
	private String employeId;
	private String employeeName;
	private double basicSalary;

	public String getEmployeId() {
		return employeId;
	}

	public void setEmployeId(String employeId) {
		if (employeId == null || employeId.isEmpty()) {
			this.employeId = "EMP000";
		} else {
			this.employeId = employeId;
		}
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		if (employeeName == null || employeeName.isEmpty()) {
			this.employeeName = "Unknown";
		} else {
			this.employeeName = employeeName;
		}
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		if (basicSalary >= 0) {
			this.basicSalary = basicSalary;
		} else {
			this.basicSalary = 0;
		}
	}

	public Employee() {
		this("EMP000", "Unknown", 0);
	}

	public Employee(String employeeId, String employeeName, double basicSalary) {
		this.setEmployeId(employeeId);
		this.setEmployeeName(employeeName);
		this.setBasicSalary(basicSalary);
	}

	void showEmployeeDetails() {
		System.out.println("========== EMPLOYEE DETAILS ==========");
		System.out.println("Employee ID:- " + employeId);
		System.out.println("Employee Name:- " + employeeName);
		System.out.println("Basic Salary:- " + basicSalary);
	}

	double calculateHRA() {
		double hra = (basicSalary * 20) / 100;
		return hra;
	}

	double calculateBonus() {
		double bonus = (basicSalary * 10) / 100;
		return bonus;
	}
}

class PermanentEmployee extends Employee {
	private String department;
	private int experiance;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (department == null || department.isEmpty()) {
			this.department = "Genral";
		} else {
			this.department = department;
		}
	}

	public int getExperience() {
		return experiance;
	}

	public void setExperience(int experience) {
		if (experience >= 0) {
			this.experiance = experience;
		} else {
			this.experiance = 0;
		}
	}

	public PermanentEmployee() {
		this("EMP000", "Unknown", 0, "General", 0);
	}

	public PermanentEmployee(String employeId, String employeeName, double basicSalary, String department,
			int experience) {
		super(employeId, employeeName, basicSalary);
		this.setDepartment(department);
		this.setExperience(experience);
	}

	void showPermanentEmployeeDetails() {
		System.out.println("Department:- " + department);
		System.out.println("Experiance:- " + experiance);
	}

	double calculateExperienceBonus() {
		double expBonus = 0;
		if (getExperience() >= 10) {
			expBonus = (getBasicSalary() * 20) / 100;
		} else if (getExperience() >= 5) {
			expBonus = (getBasicSalary() * 10) / 100;
		} else {
			expBonus = (getBasicSalary() * 5) / 100;
		}

		return expBonus;
	}

	double calculateFinalSalary() {
		double finalSalary = getBasicSalary()+calculateHRA()+calculateBonus()+calculateExperienceBonus();
		return finalSalary;
	}
	
	
	void displayAllowance() {
		System.out.println("--------------------------------------");
		System.out.println("HRA:- "+calculateHRA());
		System.out.println("Bonus:- "+calculateBonus());
		System.out.println("Experience Bonus:- "+calculateExperienceBonus());
		System.out.println("--------------------------------------");
		System.out.println("Final Salary:- "+calculateFinalSalary());
	}
}
