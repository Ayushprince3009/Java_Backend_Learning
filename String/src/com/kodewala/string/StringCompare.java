package com.kodewala.string;

public class StringCompare {
	public static void main(String[] args) {
		String fName = "Ayush";
		String lName = new String("Kumar");
		String mName = new String("Ayush");
		String sName = new String(mName);

		String city = "mfp";
		String city2 = "mfp";
		String city3 = city.concat("mfp");
		
		System.out.println(city == city2);
		System.out.println(city == city3);
		System.out.println(fName == lName);
		System.out.println(fName == mName);
		System.out.println(mName == sName);
	}
}
