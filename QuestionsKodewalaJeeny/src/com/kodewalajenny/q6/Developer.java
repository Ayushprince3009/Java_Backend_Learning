package com.kodewalajenny.q6;

public class Developer extends Employee {
	private double bonus;
	private double taxPercent;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}
	
	double calculateTax() {
		double tax = getBasicSalary() * (getTaxPercent()/100);
		//System.out.println("Tax: "+tax);
		return tax;
	}
	
	double calculateNetSalary() {
		double netSalary = getBasicSalary() + getBonus() - calculateTax();
		//System.out.println("Net Salary: "+netSalary);
		return netSalary;
	}
	
	void display() {
		System.out.println("Employee Name: "+getEmployeeName());
		System.out.println("Employee Id: "+getEmployeeId());
		System.out.println("Basic Salary: "+getBasicSalary());
		System.out.println("Bonus: "+getBonus());
		System.out.println("Tax Percentage: "+getTaxPercent());
		System.out.println("Tax Amount: "+calculateTax());
		System.out.println("Net Salary: "+calculateNetSalary());
	}
	
	
}
