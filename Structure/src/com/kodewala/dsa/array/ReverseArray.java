package com.kodewala.dsa.array;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {3,6,9,23,11,2,15,78,56,34,98,67,23,12};
		
		reverseArray(arr);
	}
	
	public static void reverseArray(int[] arr) {
		int first = 4;
		int last = 10;
		
		while(first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		
		
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
}

/*        long sumOfNumbers = (long)n*(n+1)/2;

long sumArray = 0;

for(int i=0; i<arr.length; i++){
    sumArray += arr[i];
}

return (int) (sumOfNumbers - sumArray);