package com.kodewala.dsa.array;

public class Min {
	public static void main(String[] args) {
		int[] data = { 10, 20, 30, 90, 45, 12, 6, 40, 50, 1, 9 };
		int min = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.println("Minimum element:- " + min);
	}
}
