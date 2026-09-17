package com.kodewala.updowncasting.pq8;

public class Company {
	void companyInfo() {
		System.out.println("company");
	}
}

class Employee extends Company{
	void login() {
		System.out.println("login");
	}
	void logout() {
		System.out.println("logout");
	}
}
class TeamLead extends Employee{ 
	void assignTask() {
		System.out.println("Task");
	}
}
class ProjectManager extends TeamLead{
	void approveBudget() {
		System.out.println("approve");
	}
	
	void conductMeeting() {
		System.out.println("conduct meeting");
	}
}
