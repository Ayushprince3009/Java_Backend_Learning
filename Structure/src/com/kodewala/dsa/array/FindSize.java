package com.kodewala.dsa.array;

public class FindSize {

	public static void main(String[] args) {
		int[] arr = { 45, 67, 43, 1, 23, 12, 65, 44, 49, 90 };
		int ele = 3;
		int size = SizeOfArray(arr, ele);
		System.out.println("Size Of Array:- "+size);
	}

	public static int SizeOfArray(int[] arr, int ele) {
		int size =0;
		for(int i=0; i<arr.length; i++) {
			size++;
		}
		return size;
	}

}
