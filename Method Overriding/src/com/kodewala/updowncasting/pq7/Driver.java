package com.kodewala.updowncasting.pq7;

public class Driver {
	public static void main(String[] args) {
		Person a = new Developer();
		a.walk();
		
		Developer d = (Developer) a;
		d.walk();
		d.login();
		d.writeCode();
	}
}
