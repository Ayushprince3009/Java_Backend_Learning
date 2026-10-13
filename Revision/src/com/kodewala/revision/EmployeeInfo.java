package com.kodewala.revision;

public class EmployeeInfo {
//	static int gst = 18;
//	
//	public static void main(String[] args) {
//		String name = args[0];
//		String age1 = args[1];
//		int age = Integer.parseInt(age1);
//		System.out.println("Name:- "+name);
//		System.out.println("Age:- "+age);
		
//		String name = args[0];
//		String age = args[1];
//		int age1 = Integer.parseInt(age);
//		String cusType = args[2];
//		String discount = args[3];
//		int discount1 = Integer.parseInt(discount);
//		
//		System.out.println("Customer Name:- "+name);
//		System.out.println("Age:- "+age1);
//		System.out.println("Customer Type:- "+cusType);
//		System.out.println("Discount:- "+discount1);
//		String phone = "IPhone";
//		int amount = 100000;
//		
//		double actual = amount + (amount * EmployeeInfo.gst) / 100.0;
//		
//		System.out.println("Phone:- "+phone);
//		System.out.println("Price:- "+amount);
//		System.out.println("Actual Price:-: "+actual);
//		
//		 
//	}
	
//	public void doSomething() {
//		int n = 5;
//		System.out.println(amount);
//	}
//	
//	
//	
//	public void soSomethong() {
//		System.out.println("number"+n);
//	}
	
	public static void main(String[] args) {
		String result = EmployeeInfo.placeOrder("Mobile", 50);
		//System.out.println(result);
	}
	
	public static String placeOrder(String name, int quantity) {
		System.out.println("Placed order item name :- "+name+ " of "+quantity);
		return "order placed OrderID:- AMZN1234";
	}
	
}



