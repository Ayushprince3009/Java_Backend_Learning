package com.kodewala.cloning.p1;

class Address{
	    String line1;

	    public Address(String line1) {
	        this.line1 = line1;
	    }
	    
	    @Override
	    public Address clone() throws CloneNotSupportedException{
	    	return (Address)super.clone();
	    }
}

class Employee implements Cloneable {
	String name;
	Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}


public class Driver{
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Address address = new Address("BTM 2nd Stage");
		Employee e1 = new Employee("Donni", address);
		
		Employee e2 = (Employee) e1.clone();
		
		//modifying the line1 of address
		
		e2.address.line1 = "Test Stage";
		
		System.out.println("Original obj: "+e1.name);
		System.out.println("Original Obj: "+e1.address.line1);
		
		System.out.println("Cloned Obj: "+e2.name);
		System.out.println("Cloned Obj: "+e2.address.line1);
	}
}