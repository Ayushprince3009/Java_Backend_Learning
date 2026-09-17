package com.kodewala.superthis.mobile;

public class Driver {
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		Mobile mob1 = new Mobile("Noika");
		Mobile mob2 = new Mobile("JioPhone","1030");
		Mobile mob3 = new Mobile("Micrimax", "M24", 24000);
		
		mob.displayDetails();
		mob1.displayDetails();
		mob2.displayDetails();
		mob3.displayDetails();
	}
}
