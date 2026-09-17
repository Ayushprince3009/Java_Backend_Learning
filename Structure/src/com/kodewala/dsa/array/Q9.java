package com.kodewala.dsa.array;

public class Q9 {
	public static void main(String[] args) {
		int[] arr = {2,6,4,9,1,87,45,32,14,76,69,90};
		arraySolve(arr);
		
	}
	
	public static void arraySolve(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				arr[i] += 10;
			}
			else {
				arr[i] *= 2;
			}
		}
		
		//printing array 
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
