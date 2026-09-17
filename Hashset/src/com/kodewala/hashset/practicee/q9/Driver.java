package com.kodewala.hashset.practicee.q9;

import java.util.HashSet;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
		Set<Student> std = new HashSet<Student>();
		
		Student s1 = new Student(10, "Ayush", "Java");
		Student s2 = new Student(10,"Rahul","Python");
		Student s3 = new Student(11,"Aman","Java");
		Student s4 = new Student(12, "Rohit","C++");
		Student s5 = new Student(10, "Neha","C++");
		Student s6 = new Student(11,"Priya","Python");
		
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		std.add(s6);
		
		System.out.println(std.size());
	}
}

class Student{
	private int rollNo;
	private String name;
	private String course;
	
	public Student(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return this.rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s  = (Student)obj;
		return this.rollNo == s.rollNo;
	}
	
	
}