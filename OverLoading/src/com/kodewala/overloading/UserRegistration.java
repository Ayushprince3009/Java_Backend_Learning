package com.kodewala.overloading;

public class UserRegistration {
	

	public void doRegistration(String aadhar) {
		System.out.println("doRegistration(aadhar)");
	}
	
	public void doRegistration(String name, String voterId) {
		System.out.println("doRegistration(name,voterId)");
	}
	
	public int doRegistration(int pin, String voterId) {
		System.out.println("doRegistration(pin,voterId)");
		return 0;
	}
	
	public boolean doRegistration(String dl, String name, String age) {
		System.out.println("doRegistration(dl,name,age)");
		return true;
	}
	
	private void doRegistration(String pan, int age, String name) {
		System.out.println("doRegistrstion(pan,age,name)");
	}
	
	static void doRegistration(String mobile, String otp, int age) {
		System.out.println("doRegistration(mobile,otp,age)");
	}
}
