package com.kodewala;
import java.util.*;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter marks:- ");
		//String marksStr = args[0];
		
		
		//int marks = Integer.parseInt(marksStr);
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		grade(marks);
	}
	
	public static void grade(int marks) {
		if(marks > 80 && marks <= 100) {
			System.out.println("A");
		}
		else if(marks > 60 && marks <= 80) {
			System.out.println("B");
		}
		else {
			System.out.println("F");
		}
	}                                          

}
