package com.kodewala.reverse.array;

public class Q4 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int k = 3;
		int i = 0; int j = arr.length-1;
		
		while(i<= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i += k;
			j -= k;
		}
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}
