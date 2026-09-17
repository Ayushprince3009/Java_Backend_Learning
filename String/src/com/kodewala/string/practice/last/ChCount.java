package com.kodewala.string.practice.last;

public class ChCount {
	public static void main(String[] args) {
		String str = "JaVa@123 Hi";
		
		char[] arr = str.toCharArray();
		
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int spaces = 0;
		int specialChar = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(((arr[i]>='A') && (arr[i]<='Z'))){
				upperCase++;
			}else if(((arr[i]>='a') && (arr[i]<='z'))){
				lowerCase++;
			}else if(((arr[i]>= '0') && (arr[i]<= '9'))){
				digits++;
			}else if((arr[i] == ' ')){
				spaces++;
			}else {
				specialChar++;
			}
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(digits);
		System.out.println(spaces);
		System.out.println(specialChar);
	}
}
