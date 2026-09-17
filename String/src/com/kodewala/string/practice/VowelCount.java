package com.kodewala.string.practice;

public class VowelCount {

	public static void main(String[] args) {
		String str = "Kodewala Academy";
		
		char[] arr = str.toCharArray();
		
		int vowelCount = 0;
		int constCount = 0;
		for(char s:arr) {
			char ch = Character.toLowerCase(s);
			if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
				vowelCount++;
			}
			else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))  {
				constCount++;
			}
		}
		System.out.println("Vowel Count:-"+vowelCount);
		System.out.println("ConsonentCount:-"+constCount);
	}

}
