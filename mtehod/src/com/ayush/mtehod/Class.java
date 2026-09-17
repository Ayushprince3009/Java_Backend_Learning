package com.ayush.mtehod;

public class Class {
	static int num = 12;
	public static void main(String[] args) {
		System.out.println("goTo sarts");
		goTo("mfp");
		System.out.println("goTo Ends");
		
		System.out.println("comeHere starts");
		comeHere("Sunshine");
		System.out.println("comeHere ends");
	}
	
	public static void goTo(String place) {
		System.out.println("Place Name:- "+place);
	}
	
	private static void comeHere(String loc) {
		System.out.println("Place Name:- "+loc);
		System.out.println("Number:- "+Class.num);
	}
}
