package com.kodewala.dsa.arr.del.ins;

public class q4 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 0, 0, 0 };
		int size = 3;

		// insert at beg
		if (size == arr.length) {
			System.out.println("Array is Full");
		} else {
			for (int i = size - 1; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = 5;
			size++;

			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		// insert at index 2
		if (size == arr.length) {
			System.out.println("Array is Full");
		} else {
			for (int i = size - 1; i >= 2; i--) {
				arr[i + 1] = arr[i];
			}
			arr[2] = 15;
			size++;

			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		// last position insertion
		if (size == arr.length) {
			System.out.println("Array is Full");
		} else {
			arr[size] = 40;
			size++;

			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
