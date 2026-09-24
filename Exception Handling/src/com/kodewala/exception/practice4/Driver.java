package com.kodewala.exception.practice4;

public class Driver {
	public static void main(String[] args) {
		Test test = new Test();
		test.userTest(null, "ajhsg1757");
		
	}
}

class Test{
	public void userTest(String name, String password) {
		String userId = null;
		int num = 100;
		try {
			userId = (name.substring(0,name.length()/2)+"@123");
			
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception Occurs");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("DB connection ends");
		}
		
		System.out.println("UserId:- "+userId);
		System.out.println("Password:- "+password);
		
	}
}