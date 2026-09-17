package com.kodewala.interfac.pqq7;

public interface Employee {
	void work();
}

class Developer implements Employee{
	@Override
	public void work() {
		System.out.println("Developer is working");
	}
}

class Tester implements Employee{
	@Override
	public void work() {
		System.out.println("Tester is working");
	}
}

class Manager implements Employee{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Manager is working");
	}
	
	
}