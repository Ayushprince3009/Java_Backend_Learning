package com.kodewala.updowncasting.pq6;

public class Driver {
	public static void main(String[] args) {
		Company c = new Manager();
		c.companyInfo();
		c.hireEmployee();
		
		Manager m = (Manager)c;
		m.approveLeave();
		m.conductMeeting();
	}
}
