package com.kodewala.utility.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		
		List<Student> student = new ArrayList<Student>();
		
		Student s1 = new Student(101, "Ayush");
		Student s2 = new Student(102, "Rahul");
		Student s3 = new Student(101, "Aman");
		Student s4 = new Student(99, "Ravi");
		Student s5 = new Student(102, "Rohan");
		Student s6 = new Student(104, "Ayush");
		Student s7 = new Student(109,"Ayush");
		
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		student.add(s6);
		student.add(s7);
		
		Collections.sort(student);
		
		for(int i=0; i<student.size();i++) {
			Student s = student.get(i);
			System.out.println(s.getId()+ ":-"+ s.getName());
		}
		
	}
}

class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
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
	public int compareTo(Student s) {
		int res = Integer.compare(this.id, s.id);
		if(res == 0) {
			res = this.name.compareTo(s.name);
		}
		return res;
	}
	
	
}
