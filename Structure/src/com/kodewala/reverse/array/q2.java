package com.kodewala.reverse.array;

public class q2 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		int i = 1;
		int j = 5;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}
