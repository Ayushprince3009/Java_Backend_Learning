package com.kodewala.constructorChaining.compamny;

public class Driver {
	public static void main(String[] args) {
		Display info1 = new Display("Lala Infotech", "Ritesh kr", "Tech");
		info1.displayDetails();
		
		Display info2 = new Display("ScamSung", "Bittu", "Non-Tech");
		info2.displayDetails();
	}
}
