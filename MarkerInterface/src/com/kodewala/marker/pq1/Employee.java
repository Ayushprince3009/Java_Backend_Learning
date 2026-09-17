package com.kodewala.marker.pq1;

public class Employee implements Cloneable{
	private String name;
	private String location;
	
	public Employee(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
