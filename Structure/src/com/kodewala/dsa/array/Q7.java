//Count the total number of elements (using the current size variable).

package com.kodewala.dsa.array;

public class Q7 {
	public static void main(String[] args) {
		int[] arr = {34,23,64,87,23,457,76,234,646,342,55};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			count++;
		}
		System.out.println("Total Elements:- "+count);
	}
}
