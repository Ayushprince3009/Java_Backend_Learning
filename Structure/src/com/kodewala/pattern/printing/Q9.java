package com.kodewala.pattern.printing;

public class Q9 {
	public static void main(String[] args) {
		int n=6;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=n; col++) {
				if(row==1 || row==n || col==1 || col==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
