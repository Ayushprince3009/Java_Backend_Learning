package com.kodewala.exception.practice2;

public class Driver5 {
	public static void main(String[] args) {
		String[] salaries = {
			    "45000",
			    "55000",
			    "abc",
			    "70000",
			    "80000"
			};

			int index = 2;
			int months = 12;
			
			try {
				System.out.println("Salary at index "+index+" is:- "+salaries[index]);
				
				int salary = Integer.parseInt(salaries[index]);
				
				int monthlySalary = salary / 12;
				
				System.out.println("Monthly Salary:- "+monthlySalary);
			}
			catch(NumberFormatException e) {
				System.out.println("Unable to Process Salary");
				e.printStackTrace();
			}
	}
}
