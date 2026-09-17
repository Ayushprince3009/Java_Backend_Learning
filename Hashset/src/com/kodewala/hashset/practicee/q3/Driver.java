package com.kodewala.hashset.practicee.q3;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(10);
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(26);
		
		int capacity = 16;
		
		int hash = e1.hashCode();
		int spreadhash = hash ^ (hash >>> 16);
		System.out.println("HashCode:- "+spreadhash);
		int bucket = spreadhash & (capacity -1);
		System.out.println("Bucket:- " + bucket);
		
		int hashE2 = e2.hashCode();
		int spreadhashE2 = hashE2 ^ (hashE2 >>> 16);
		System.out.println("HashCode:- "+spreadhashE2);
		int bucketE2 = spreadhashE2 & (capacity -1);
		System.out.println("Bucket:- " + bucketE2);
		System.out.println(e1.hashCode() == e2.hashCode());
		System.out.println(e1.hashCode() == e3.hashCode());
		System.out.println(e2.hashCode() == e3.hashCode());
		
		int hashE3 = e3.hashCode();
		int spreadhashE3 = hashE3 ^ (hashE3 >>> 16);
		System.out.println("HashCode:- "+spreadhashE3);
		int bucketE3 = spreadhashE3 & (capacity -1);
		System.out.println("Bucket:- " + bucketE3);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
	}
}

class Employee{
	int id;
	
	Employee(int id){
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
}
