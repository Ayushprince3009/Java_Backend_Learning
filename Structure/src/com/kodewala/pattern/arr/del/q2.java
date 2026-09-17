package com.kodewala.pattern.arr.del;

public class q2 {
	public static void main(String[] args) {
		int[] arr = {5, 15, 25, 35, 45, 55};
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;

		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}
