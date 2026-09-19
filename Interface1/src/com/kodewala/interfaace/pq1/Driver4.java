package com.kodewala.interfaace.pq1;

public class Driver4 {
	public static void main(String[] args) {
		Employee e1 = new Manager();
		e1.doWork();
		e1.leave();
		
		Employee e2 = new Developer();
		e2.doWork();
		e2.leave();
	}
}

interface Employee{
	void doWork();
	default void leave() {
		System.out.println("12 Days leave");
	}
}

class Manager implements Employee{
	@Override
	public void doWork() {
		System.out.println("Manager is doing his work");
	}
}

class Developer implements Employee{
	@Override
	public void doWork() {
		System.out.println("Employees Are Doing their Work");
	}
	
	@Override
	public void leave() {
		System.out.println("18 leaves are applied for employees");
	}
}