package com.kodewala.superExplore;

public class ChildClass {
	private String name;
	private int age;
	private int balance; 
	
//	ChildClass(){
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(balance);
//	}
//	
//	ChildClass(String _name, int _age, int _balance){
//		this.name = _name;
//		this.age = _age;
//		this.balance = _balance;
//		System.out.println(_name);
//		System.out.println(_age);
//		System.out.println(_balance);
//		
//	}
//	
	ChildClass(int _age, int _balance, String _name){
		this.age = _age;
		this.balance = _balance;
		this.name = _name;
		
		System.out.println(_age);
		System.out.println(_balance);
		System.out.println(_name);
	}
	
	
	ChildClass(){
		this(22, 19000, "Ayush");
	}
	
	ChildClass(String _name, int _age, int _balance){
		this.name = _name;
		this.age = _age;
		this.balance = _balance;
		System.out.println(_name);
		System.out.println(_age);
		System.out.println(_balance);
		
	}
}