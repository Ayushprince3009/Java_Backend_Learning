package com.kodewala.encapsulation.mobile;

public class Driver {
	public static void main(String[] args) {
		MobileDetails md = new MobileDetails("Samsung","S23",67000);
		md.displayMobileDetails();
		
		md.setBrand("Iphone");
		md.setModel("17");
		md.setPrice(74000);
		md.displayMobileDetails();
	}
}
