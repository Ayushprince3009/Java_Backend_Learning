package com.kodewala.reduce;

import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private String department;
    private boolean active;
    private List<Integer> marks;

    public Student(String name, String department,
                   boolean active, List<Integer> marks) {
        this.name = name;
        this.department = department;
        this.active = active;
        this.marks = marks;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public boolean isActive() { return active; }
    public List<Integer> getMarks() { return marks; }
}
public class Q4 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			    new Student("Amit", "MCA", true, Arrays.asList(80, 75, 90)),
			    new Student("Neha", "MBA", true, Arrays.asList(65, 70, 72)),
			    new Student("Rahul", "MCA", false, Arrays.asList(95, 92, 88)),
			    new Student("Priya", "MCA", true, Arrays.asList(85, 90, 95)),
			    new Student("Karan", "MBA", true, Arrays.asList(55, 60, 58)),
			    new Student("Sneha", "MCA", true, Arrays.asList(70, 80, 75))
			);
		
		//1st pipeline
		
		//2nd pipeline
		
				
			
	}
}
