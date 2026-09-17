package com.kodewala.streamAPI.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver8 {
	public static void main(String[] args) {
		List<Employeeee> employees = Arrays.asList(
			    new Employeeee("Ayush",
			        Arrays.asList("Java", "Spring Boot", "SQL")),

			    new Employeeee("Rahul",
			        Arrays.asList("Java", "Microservices")),

			    new Employeeee("Amit",
			        Arrays.asList("SQL", "Docker"))
			);

		List<String> output = employees.stream()
				.flatMap(emp -> emp.getSkill().stream())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(output);
		
		
	}
}

class Employeeee{
	private String name;
	private List<String> skill;
	
	public Employeeee(String name, List<String> skill) {
		this.name = name;
		this.skill = skill;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getSkill(){
		return skill;
	}
}