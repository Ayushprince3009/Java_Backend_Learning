package com.kodewala.interfaace.pq1;

public class Driver6 {
	public static void main(String[] args) {
		Report sales = new SalesReport();
		sales.generateReport();
		sales.exportReport();
		
		Report employee = new EmployeeReport();
		employee.exportReport();
		employee.generateReport();
		
		Report financial = new FinancialReport();
		financial.generateReport();
		financial.exportReport();
		
	}
}

interface Report{
	void generateReport();
	default void exportReport() {
		System.out.println("Report exported to PDF");
	}
}

class SalesReport implements Report{
	@Override
	public void generateReport() {
		System.out.println("Sales Reoprt Generatd");
	}
}

class EmployeeReport implements Report{
	@Override
	public void generateReport() {
		System.out.println("Employee Report Generated");
	}
	
	@Override
	public void exportReport() {
		System.out.println("Report exported to .csv");
	}
}

class FinancialReport implements Report{
	@Override
	public void generateReport() {
		System.out.println("Financial Report Generated");
	}
}