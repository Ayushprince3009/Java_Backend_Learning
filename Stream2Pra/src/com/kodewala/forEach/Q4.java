package com.kodewala.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;
    private String department;
    private double percentage;
    private List<String> subjects;
    private List<String> skills;

    public Student(int id, String name, String department,
                   double percentage, List<String> subjects,
                   List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.percentage = percentage;
        this.subjects = subjects;
        this.skills = skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getPercentage() { return percentage; }
    public List<String> getSubjects() { return subjects; }
    public List<String> getSkills() { return skills; }
}
public class Q4 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			    new Student(1, "Aman", "MCA", 82,
			        Arrays.asList("Java", "DBMS", "Networks"),
			        Arrays.asList("Java", "SQL", "Spring")),
			    new Student(2, "Riya", "BCA", 68,
			        Arrays.asList("Python", "DBMS"),
			        Arrays.asList("Python", "SQL")),
			    new Student(3, "Karan", "MCA", 91,
			        Arrays.asList("Java", "Cloud", "Networks"),
			        Arrays.asList("Java", "Spring Boot", "Docker")),
			    new Student(4, "Pooja", "MCA", 74,
			        Arrays.asList("DBMS", "Networks"),
			        Arrays.asList("SQL", "Communication")),
			    new Student(5, "Vivek", "BCA", 88,
			        Arrays.asList("Python", "Cloud", "DBMS"),
			        Arrays.asList("Python", "Docker")),
			    new Student(6, "Sneha", "MCA", 59,
			        Arrays.asList("Java", "DBMS"),
			        Arrays.asList("Java", "SQL")),
			    new Student(7, "Arjun", "MCA", 85,
			        Arrays.asList("Cloud", "Networks"),
			        Arrays.asList("Docker", "Spring"))
			);
		
		//1st pipeline
		List<String>highPerformingMcaStudents = students.stream()
				.filter(stu -> stu.getDepartment().equalsIgnoreCase("mca")
						&& stu.getPercentage() >= 80)
				.map(stu -> stu.getName())
				.collect(Collectors.toList());
		System.out.println(highPerformingMcaStudents);
		
		//2nd pipeline
		long count = students.stream()
				.filter(stu -> (stu.getDepartment().equalsIgnoreCase("mca") || stu.getDepartment().equalsIgnoreCase("bca"))
						&& stu.getPercentage() >= 75)
				.count();
		System.out.println(count);
		
		//3rd pipeline
		List<String> disSub = students.stream()
				.filter(stu -> stu.getDepartment().equalsIgnoreCase("mca"))
				.flatMap(stu -> stu.getSubjects().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(disSub);
		
		//4th pipeline
		
		students.stream()
		.filter(stu -> stu.getPercentage() >= 80)
		.forEach(stu -> System.out.println(stu.getName()+" -- "+stu.getDepartment()+" -- "+stu.getPercentage()));
		
		
	}
}
