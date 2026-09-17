package com.kodewalajenny.q9;

public class Student extends Department {
	private String studentName;
	private int marks;
	
	public Student(String universityName, String departmentName, String studentName, int marks) {
		super(universityName,departmentName);
		this.studentName = studentName;
		setMarks(marks);
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		if((marks >= 0) && (marks <=100)) {
			this.marks = marks;
		}
		else {
			System.out.println("Invalid Marks");
		}
	}
	
	String grade() {
		if((marks >= 0) && (marks <=100)) {
			if(marks >= 90) {
				
				return"A";
			}
			else if(marks >= 80) {
				
				return"B";
			}
			else if(marks >= 70) {
				
				return"C";
			}
			else {
				
				return"D";
			}
		}
		else {
			return "invalid marks";
		}
		
		//validation galat hai need to handle edge cases 
	}
	
	void display() {
		System.out.println("University Name: "+getUniversityName());
		System.out.println("Department Name: "+getDepartmentName());
		System.out.println("Student Name: "+studentName);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade());
	}
}
