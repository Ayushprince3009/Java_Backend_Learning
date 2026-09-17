package com.ayush.mtehod;

public class ClasTeacher {

	public static void main(String[] args) {
		System.out.println("goTo sarts");
		Class.goTo("mfp");
		System.out.println("goTo Ends");
		
		System.out.println("comeHere starts");
		//Class.comeHere("Sunshine");                    //we cant access private method to other class this can be accessed within the same class
		System.out.println("comeHere ends");
	}

}
