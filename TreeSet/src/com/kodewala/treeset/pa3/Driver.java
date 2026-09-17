package com.kodewala.treeset.pa3;

import java.util.Set;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student(101, "Ayush");
		Student s2 = new Student(102, "Rahul");
		Student s3 = new Student(101, "Aman");
		Student s4 = new Student(99, "Ravi");
		Student s5 = new Student(102, "Rohan");
		Student s6 = new Student(104, "Ayush");
		Student s7 = new Student(109,"Ayush");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		
		System.out.println(set);
		
		for(Student std : set) {
			System.out.println(std.getId() + " - "+std.getName());
		}
	}
}

class Student implements Comparable<Student>{
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	@Override
	public int compareTo(Student o) {
		int result = Integer.compare(this.id, o.id);
		if(result == 0) {
			result = this.getName().compareTo(o.getName());
		}
		System.out.println(this.id + " , "+o.id + " - "+result);
		return result;
	}	
	
//	@Override
//	public String toString() {
//		return id + " " + name;
//	}
}