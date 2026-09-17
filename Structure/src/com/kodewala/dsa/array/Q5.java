//Print only odd numbers.

package com.kodewala.dsa.array;

public class Q5 {

	public static void main(String[] args) {
		int[] arr = {34,23,64,87,23,457,76,234,646,342,55};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i]+ " ");
			}
			else {
				continue;
			}
		}

	}

}
