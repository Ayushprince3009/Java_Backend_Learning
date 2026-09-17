package com.kodewala.dsa.arr.del.ins;

public class q3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60, 0};
		int size = 6;
		int index = 2;
		//delete from beg
		for(int i=0; i<size; i++) {
			arr[i] = arr[i+1];
		}
		size--;
		
		for(int i=0;i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//del from last
		
		size--;
		for(int i=0;i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//del from index 2
		
		for(int i=index; i<size; i++) {
			arr[i] = arr[i+1];
		}
		
		size--;
		
		for(int i=0;i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
