package com.kodewala.dsa.array;

public class SecondLargest {
	public static void secondLargestEle(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else {
				if( arr[i] != largest && arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		System.out.println("Largest ele:- "+largest);
		System.out.println("Second Largest ele:- "+secondLargest);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,6,9,23,11,2,15,78,56,34,98,67,23,12};
		
		secondLargestEle(arr);
	}
}
