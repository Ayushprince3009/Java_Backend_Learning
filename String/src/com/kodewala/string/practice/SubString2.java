package com.kodewala.string.practice;

public class SubString2 {
	public static void main(String[] args) {
		String str = "ayush@gmail.com";
		String str1= "resume.pdf";
		
		int index = str.indexOf('@');
		int index1 = str1.indexOf('.');
		
		System.out.println(str.substring(index+1));
		System.out.println(str1.substring(index1+1));
		System.out.println(str1.substring(0,index1));
	}
}
