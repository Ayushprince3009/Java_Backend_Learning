//package com.kodewala.streamAPI.practice3;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Driver10 {
//	public static void main(String[] args) {
//		List<Employeee> employees = Arrays.asList(
//			    new Employeee("Ayush", 8.0),
//			    new Employeee("Rahul", 4.0),
//			    new Employeee("Amit", 7.0),
//			    new Employeee("Rohit", 6.0),
//			    new Employeee("Vikas", 3.0)
//			);
//		
//		employees.stream().filter(emp -> (emp.getSalary() > 5.0))
//		.map(emp -> emp.getName())
//		.forEach(emp -> System.out.println(emp));
//		
//	}
//}
//
//class Employeee {
//
//    private String name;
//    private double salary;
//
//    public Employeee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//}
