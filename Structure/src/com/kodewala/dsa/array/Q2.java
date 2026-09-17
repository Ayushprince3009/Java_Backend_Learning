//Print elements in reverse order

package com.kodewala.dsa.array;

public class Q2 {

	public static void main(String[] args) {
		int[] arr= {111,24,34,43,56,62,37,82};
		int start = 0;
		int last= arr.length-1;
		
		while(start < last) {
			int temp = arr[start];
			arr[start] = arr[last];
			arr[last] = temp;
			
			start++;
			last--;
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
