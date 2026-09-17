package com.kodewala.string.practice;

public class SpaceRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "    Ayush Kumar     ";
		
		char[] arr = str.toCharArray();
		
		System.out.println(arr.length);
		
		String res = str.trim();
		
		System.out.println(res);
		
		char[] arr1 = res.toCharArray();
		System.out.println(arr1.length);
	}

}
