package com.kodewala.superr;

public class ExploreSuper {
	private String name;
	private int age;
	private String address;

	ExploreSuper() {
		this("aman", 22, "BTM");
	}

	ExploreSuper(String _name, int _age, String _address) {
		super();
		this.name = _name;
		this.age = _age;
		this.address = _address;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
}
