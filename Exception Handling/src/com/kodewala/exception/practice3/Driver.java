package com.kodewala.exception.practice3;

public class Driver {
	public static void main(String[] args) {
		 UserName driver = new UserName("ayush", "ayush@123)(8");
		driver.userName();
	}
	
//	public void userName(String name, String password) {
//		System.out.println("driver.username().....starts");
//		String userId = name.substring(0, name.length()/2)+"@123"+name.substring(2, name.length());
//		System.out.println("UserID:- "+userId);
//		System.out.println("Password:- "+password);
//		System.out.println("driver.userName().... ends");
//	}
	
}


class UserName{
//	public void userName(String name, String password) {
//		System.out.println("driver.username().....starts");
//		String userId = name.substring(0, name.length()/2)+"@123"+name.substring(2, name.length());
//		System.out.println("UserID:- "+userId);
//		System.out.println("Password:- "+password);
//		System.out.println("driver.userName().... ends");
//	}
	
	String name;
	String password;
	
	public UserName(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	void userName() {
		System.out.println("driver.username().....starts");
		String userId = name.substring(0, name.length()/2)+"@123"+name.substring(2, name.length());
		System.out.println("UserID:- "+userId);
		System.out.println("Password:- "+password);
		System.out.println("driver.userName().... ends");
	}
}