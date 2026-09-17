package com.kodewala.streamAPI.practice5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver5 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Aarav", 92, 85), new Student("Meera", 78, 91),
				new Student("Ravi", 88, 72), new Student("Priya", 95, 97),
				new Student("Kiran", 70, 68), new Student("Neha", 83, 89),
				new Student("Dev", 90, 76), new Student("Sita", 81, 82)
				);
		
		List<String> name = students.stream()
				.filter(stu -> stu.getMath() > 80)
				.filter(stu -> stu.getScience() > 80)
				.map(stu -> stu.getName())
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(name);
	}
}

class Student {
	String name;
	int mathScore;
	int scienceScore;

	Student(String n, int m, int s) {
		name = n;
		mathScore = m;
		scienceScore = s;
	}

	public String getName() {
		return name;
	}

	public int getMath() {
		return mathScore;
	}

	public int getScience() {
		return scienceScore;
	}
}
