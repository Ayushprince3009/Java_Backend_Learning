package com.kodewala.exception.practice2;

public class Driver {
	public static void main(String[] args) {
		int[] marks = {78, 85, 91, 66, 72};
		int index = 3;
		try {
			System.out.println("Element:- "+marks[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		
		
	}
}
