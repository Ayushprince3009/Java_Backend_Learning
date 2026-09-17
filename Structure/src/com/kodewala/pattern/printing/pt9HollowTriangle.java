package com.kodewala.pattern.printing;

public class pt9HollowTriangle {
	public static void main(String[] args) {
		int n=5;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=9; col++) {
				if(row == 5) {
					System.out.print("*"+" ");
				}
				else {
					if((row+col == 6) || (row+col == 8) || (row+col == 10) || (row+col == 12)) {
						System.out.print("*"+" ");
					}else {
						System.out.print(" "+" ");
					}
				}
			}
			System.out.println();
		}
	}
}




//ye nhi ban paya hai abhi tak 