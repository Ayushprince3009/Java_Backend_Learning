package com.kodewala.reduce;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

class Employee {
    private String name;
    private String department;
    private double salary;
    private boolean active;

    public Employee(String name, String department,
                    double salary, boolean active) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.active = active;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public boolean isActive() { return active; }
}
public class Q1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Amit", "IT", 60000, true),
			    new Employee("Neha", "HR", 45000, true),
			    new Employee("Rahul", "IT", 75000, false),
			    new Employee("Priya", "IT", 80000, true),
			    new Employee("Karan", "Finance", 55000, true),
			    new Employee("Sneha", "HR", 50000, false),
			    new Employee("Vikas", "IT", 70000, true)
			);
		//1st pipeline
		double totalSalary = employees.stream()
				.filter(emp -> emp.getDepartment().equalsIgnoreCase("IT") && emp.isActive())
				.map(emp -> emp.getSalary())
				.reduce(0.0, (a,b) -> a + b);
		System.out.println(totalSalary);
		
		//2nd pipeline
		long eligibleEmployee = employees.stream()
				.filter(emp -> emp.isActive() && emp.getSalary() >= 50000)
				.count();
		System.out.println(eligibleEmployee);
		
		//3rd pipeline
		List<String> activeITNames = employees.stream()
				.filter(emp -> emp.isActive() && emp.getDepartment().equalsIgnoreCase("IT"))
				.map(emp -> emp.getName())
				.sorted()
				.collect(Collectors.toList());
		System.out.println(activeITNames);
		
		//4th pipeline
		employees.stream()
		.filter(emp -> emp.isActive() && emp.getSalary() > 55000)
		.map(emp -> emp.getName())
		.forEach(emp -> System.out.println(emp));
		
	}
}
