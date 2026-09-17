package com.kodewala.string.practice;

public class countUpperCase {
	public static void main(String[] args) {
		String str = "Ja VAP roG ra m ";
		int len = str.length();
		System.out.println("Length of String:-"+len);
		
		char[] arr = str.toCharArray();
		
		int upperCount = 0;
		int lowerCount = 0;
		int spaceCount = 0;
		
		for(char s : arr) {
			if(s >= 'A' && s <= 'Z') {
				upperCount++;
			}
			else if(s >= 'a' && s <= 'z') {
				lowerCount++;
			}
			else {
				spaceCount++;
			}
		}
		System.out.println("UpperCase:-"+upperCount);
		System.out.println("LowerCase:-"+lowerCount);
		System.out.println("SpaceCount:-"+spaceCount);
	}
}
