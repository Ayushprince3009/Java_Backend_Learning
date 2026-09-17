package com.kodewala.encapsulation.studentdetails;

public class Details {
	private String name;
	private int roll;
	private int marks;

	public Details(String name, int rollNo, int subMarks) {
		this.name = name;
		this.roll = rollNo;
//		if (subMarks >= 0 && subMarks <= 100) {
//			this.marks = subMarks;
//		} else {
//			this.marks = 0; 
//		}
		setMarks(subMarks);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int rollNo) {
		this.roll = rollNo;
	}

	public void setMarks(int subMarks) {
		if (subMarks >= 0 && subMarks <= 100) {
			this.marks = subMarks;
		}
		else {
			this.marks = 0;
		}
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public int getMarks() {
		return marks;
	}
}
