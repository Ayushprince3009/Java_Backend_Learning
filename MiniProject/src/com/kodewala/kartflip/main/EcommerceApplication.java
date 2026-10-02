package com.kodewala.kartflip.main;

import java.util.Scanner;

public class EcommerceApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to KartFlip:- Your one stop e-com solution");
		System.out.println();
		System.out.println("       ==========Register/Login==========");
		System.out.println();
		System.out.println("Choose from the below Options to proceed");
		System.out.println("1.Customer");
		System.out.println("2.Admin");
		System.out.println("3.Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice:-");
		int choice = sc.nextInt();
	
		if(choice == 1) {
			System.out.println("Welcome to Customer Login/Register page");
		}
		else if(choice == 2) {
			System.out.println("Welcome to Admin Login page");
		}
		else if(choice == 3) {
			System.out.println("Exit the Application");
		}
		else {	
			System.out.println("Invalid input choose correct option");
		}
	}
}
