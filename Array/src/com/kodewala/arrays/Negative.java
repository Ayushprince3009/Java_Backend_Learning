package com.kodewala.arrays;

public class Negative {

	public static void main(String[] args) {
		int arr[] = {1,45,76,23,56,76,-87,45,2,443,24,87};
		
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < 0) {
				count++;
				break;
			}	
		}
		if(count > 0) {
			System.out.println("Negative Found");
		}
		else {
			System.out.println("Positive Found");
		}

	}

}
