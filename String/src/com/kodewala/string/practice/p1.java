package com.kodewala.string.practice;

public class p1 {
	public static void main(String[] args) {
		String str = "akjdsf sdjafh ajfhj ljfj";
		int len = str.length();
		System.out.println("Length of String:- "+len);
		
		char firstCharacter = str.charAt(0);
		System.out.println("First Character:- "+firstCharacter);
		
		char lastCharacter = str.charAt(str.length() - 1);
		System.out.println("Last Character:-"+lastCharacter);
		
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
		String str2 = str.toLowerCase();
		System.out.println(str2);
		
		String str3 = " ";
		System.out.println(str3.isEmpty());
		//System.out.println(str3.isBlank());
	
		String str4 = "   ayush  kumar   ";
		
		String str5 = str4.trim();
		System.out.println(str5);
		System.out.println(str5.length());
	}
}
