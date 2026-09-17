package com.kodewala.interfaceDPS.p1;

public interface IPayroll {
	void employeeType();
	
	default void calculateSalary() {
		salaryValidation();
		System.out.println("Salary calculate");
	}
	
	default void paySlip() {
		salaryValidation();
		System.out.println("Payslip generate");
	}
	
	static void payrollPolicy() {
		System.out.println("Common Payroll Policy");
	}
	
	private static void salaryValidation() {
		System.out.println("Validating Payment");
	}
}
