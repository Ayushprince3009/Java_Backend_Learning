package com.kodewala.arrays;

public class Marks {

	public static void main(String[] args) {
		
		int marks[] = {45,67,87,34,54};    //marks array
		
		int sumMarks = 0;     //sum initialization
		
		int countSubject = 0;    //counts total subjects
		
		for(int i=0; i<marks.length; i++) {     //loop for sumMarks
			sumMarks += marks[i];
			countSubject++;       //increments the subject count
		}
		System.out.println("Total Sum:- "+sumMarks);     //total marks printing
		
		System.out.println("Total Subjects:- "+countSubject);  //total subject printing
	}

}
