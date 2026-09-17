package com.kodewala.updowncasting.pq6;

public class Company {
	void companyInfo() {
		System.out.println("ComapnyInfo....");
	}
	
	void hireEmployee() {
		System.out.println("Hireddd........");
	}
}

class Manager extends Company{
	void approveLeave() {
		System.out.println("Leave Approved");
	}
	
	void conductMeeting() {
		System.out.println("Meeting Conducted");
	}
}
