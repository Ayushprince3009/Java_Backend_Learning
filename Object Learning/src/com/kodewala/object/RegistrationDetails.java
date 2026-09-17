package com.kodewala.object;

public class RegistrationDetails {

	public static void main(String[] args) {
		Details info = new Details();
		
		info.email = "ayushkkumar840mail.com";
		info.userName = "ayushkkumar840";
		info.mobileNo = "8540966758";
		info.age = 25;
		info.gender = "Male";
		
		info.displayDetails();
		
		Details info_2 = new Details();
		info_2.email = "princerajj840@gmail.com";
		info_2.userName = "princerajj840";
		info_2.mobileNo = "9835342448";
		info_2.age = 26;
		info_2.gender = "Male";
		
		info_2.displayss();
		
	}

}
