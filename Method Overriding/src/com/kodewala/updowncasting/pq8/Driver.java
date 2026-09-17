package com.kodewala.updowncasting.pq8;

public class Driver {
	public static void main(String[] args) {
		Company c = new ProjectManager();
		c.companyInfo();
		
		ProjectManager m = (ProjectManager) c;
		m.approveBudget();
		m.conductMeeting();
		m.assignTask();
		m.login();
		m.logout();
		m.companyInfo();
	}
}	
