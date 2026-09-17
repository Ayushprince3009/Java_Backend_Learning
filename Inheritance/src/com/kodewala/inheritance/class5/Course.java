package com.kodewala.inheritance.class5;

public class Course {
	private String name;
	private int time;
	
	public Course(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	public int getTime() {
		return time;
	}
	
	void enroll() {
		System.out.println("Course enrolled Sucessfully");
	}
	void complete() {
		System.out.println("Course Completed Sucessfully");
	}
	
	void display() {
		System.out.println("Course Name:- "+name);
		System.out.println("Course Duration:- "+time+" months.");
	}
}

class JavaCourse extends Course{
	private String trainerName;
	
	public JavaCourse(String name, int time, String trainerName) {
		super(name, time);
		this.trainerName = trainerName;
	} 
	
	void startCoding() {
		System.out.println("Java coding started");
	}
	
	void displayDetails() {
		display();
		System.out.println("Trainer:- "+trainerName);
		enroll();
		startCoding();
		complete();
		System.out.println();
	}
}
