/*
	3.Given a list of employees, use filter()
	 to find employees with salary greater than 10 LPA and
	  map() to get only their names.
 */
package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver7 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(5,"Ayush"),
				new Employee(13,"Ritesh"),
				new Employee(23,"Solanki"),
				new Employee(28,"Nitin"),
				new Employee(9,"Tabrez"),
				new Employee(16,"Abhinav"));
		//convert to stream
		Stream<Employee> emp = list.stream();
		//filter
		Stream<Employee> filterEmp = emp.filter(sal -> ( sal.salary > 10));
		//map
		Stream<String> nameMap = filterEmp.map(n -> (n.name));
		//convert to list
		
		List<String> name = nameMap.collect(Collectors.toList());
		System.out.println(name);
		
	}
}

class Employee{
	int salary;
	String name;
	
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
}
