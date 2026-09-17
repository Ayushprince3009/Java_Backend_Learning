package com.kodewala.dsa.string;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String str = "papaya";

		char[] arr = str.toLowerCase().toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			boolean isRepeated = false;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					isRepeated = true;
					break;
				}
			}
			if(isRepeated) {
				continue;
			}
			
			int count = 1;
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i] == arr[k]) {
					count++;
				}
			}
			System.out.println("Frequency of character "+arr[i]+" = "+count);
		}

			
	}	
}

