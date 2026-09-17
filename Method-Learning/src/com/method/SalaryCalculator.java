package com.method;

public class SalaryCalculator {

	public static void main(String[] args) {
		String employeeName = args[0];
		String basicSalaryStr = args[1];
		
		int basicSalary = Integer.parseInt(basicSalaryStr);
		taxPercent(basicSalary, employeeName);
	}
	
	public static double taxPercent(int basic, String employeeName) {
		
		double tax;
		
		if(basic > 100000 && basic <= 150000) {
			tax = 7.5;
		}
		else if(basic > 150000 && basic <= 300000) {
			tax = 10.4;
		}
		else if(basic > 300000 && basic <= 500000) {
			tax = 15.0;
		}
		else if(basic > 500000) {
			tax = 25.0;
		}
		else {
			tax = 0.0;
		}
		
		System.out.println("Tax percent:- "+tax);
		taxAmount(basic, tax, employeeName);
		return tax;
	}
	
	public static double taxAmount(int basic, double tax, String employeeName) {
		double amountTax = basic*tax/100;
		
		System.out.println("Tax Amount:- "+amountTax);
		displaySalary(basic, amountTax, employeeName);
		return amountTax;
	}
	
	public static void displaySalary(int basic, double amountTax, String employeeName) {
		double netSalary = basic - amountTax;
		System.out.println(employeeName+" will get "+"Net Salary:- "+netSalary+".");
	}
}
