package com.kodewala.overloading;

public class Driver {
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		user.doRegistration("123-345-567");
		user.doRegistration(1234, "1234556");
		user.doRegistration("Ayush", "567890");
	}
}
