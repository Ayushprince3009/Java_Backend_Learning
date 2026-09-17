package com.kodewala.pattern.arr.del;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400, 500};
		int size = 5;
		
		for(int i = 0; i< size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}
