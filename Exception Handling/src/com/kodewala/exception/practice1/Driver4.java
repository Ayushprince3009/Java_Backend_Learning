package com.kodewala.exception.practice1;

public class Driver4 {
	public static void main(String[] args) {
		System.out.println("Main Started....");
		System.out.println("Main Running.....");
		Driver4 drive = new Driver4();
		drive.task();
		System.out.println("New Method");
		drive.charAt();
		
		System.out.println("Main Ends...");
		
	}
	
	private void task() {
		System.out.println("Task Started....");
		System.out.println("Task Running.....");
		try {
			String name = null;
			System.out.println("Name:- "+name+ " Length:- "+name.length());
		}
		catch(NullPointerException e) {
			System.out.println("Name cannot be null");
			e.printStackTrace();
		}
		System.out.println("Task End");
	}
	
	private void charAt(){
		System.out.println("charAT Started...");
		System.out.println("charAt running...");
		try {
			String name = "Ayush";
			System.out.println("Character At Index:- "+name.charAt(23));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Character Not Found at that Index");
			e.printStackTrace();
		}
		System.out.println("charAt Ends...");
	}
}
