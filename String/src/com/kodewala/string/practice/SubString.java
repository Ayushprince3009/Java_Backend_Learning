package com.kodewala.string.practice;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Programming";
		
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(5));
		
		
		String str1 = "Developer";
		
		char[] arr = str1.toCharArray();
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(str1.substring(0,5));
		System.out.println(str1.length());
		System.out.println(str1.substring( 5, str1.length()));
	}

}
