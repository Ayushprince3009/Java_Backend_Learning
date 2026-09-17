package com.kodewalajenny.q6;

public class Driver {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.setEmployeeId("emp101");
		d.setEmployeeName("Manoj");
		d.setBasicSalary(54000);
		d.setBonus(12000);
		d.setTaxPercent(18.56);
		d.display();
	}
}
