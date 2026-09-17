package com.kodewala.updowncasting.pq3;

public class Driver {
	public static void main(String[] args) {
		Employee e = new Developer();
		e.login();
		e.logout();
		
		Developer d = (Developer) e;
		d.writeCode();
	}
}
