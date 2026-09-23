package com.kodewala.exception.practice3;

public class Driver1 {
	public static void main(String[] args) {
		 UserName1 driver = new UserName1();
		driver.userName("ayush", "ayush@123)(8");
	}
	
//	public void userName(String name, String password) {
//		System.out.println("driver.username().....starts");
//		String userId = name.substring(0, name.length()/2)+"@123"+name.substring(2, name.length());
//		System.out.println("UserID:- "+userId);
//		System.out.println("Password:- "+password);
//		System.out.println("driver.userName().... ends");
//	}	
}


class UserName1{
	public void userName(String name, String password) {
		
		String name1 = null;
		String county = "India";
		System.out.println("driver.username().....starts");
		int num = 15;
		System.out.println("Number:-"+num);
		try {
			System.out.println("character:-"+ county.charAt(7));
			System.out.println(num / 0);
			String userId = name1.substring(0, name1.length()/2)+"@123"+name1.substring(2, name1.length());
			
		}
		
		catch(NullPointerException e) {
			System.out.println("userName not found");
			e.printStackTrace();
		}
		
		catch(ArithmeticException e) {
			System.out.println("Can not divide by Zero");
			e.printStackTrace();
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String not found");
			e.printStackTrace();
		}
		
		System.out.println("UserID:- "+name1);
		System.out.println("Password:- "+password);
		System.out.println("driver.userName().... ends");
	}
}	