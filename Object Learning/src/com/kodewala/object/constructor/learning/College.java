/*Create a College class having these constructors:

College()

College(String name)

College(String name, String city)

College(String name, String city, int ranking)

From main(), create:

College c1 = new College();

College c2 = new College("GL Bajaj");

College c3 = new College("GL Bajaj", "Greater Noida");

College c4 = new College("GL Bajaj", "Greater Noida", 5);

Print a different message from each constructor 
so you can clearly see how Java chooses the constructor based on
the number, type, and order of arguments.*/
package com.kodewala.object.constructor.learning;

public class College {

	public static void main(String[] args) {
		CollegeDetails c1 = new CollegeDetails();

		CollegeDetails c2 = new CollegeDetails("GL Bajaj");

		CollegeDetails c3 = new CollegeDetails("GL Bajaj", "Greater Noida");

		CollegeDetails c4 = new CollegeDetails("GL Bajaj", "Greater Noida", 5);

	}

}

class CollegeDetails{
	private String name;
	private String city;
	private int ranking;
	
	CollegeDetails(){
		System.out.println("Default constructor");
	}

	CollegeDetails(String _name){
		this.name = _name;
		System.out.println("College Name:- "+name);
	}

	CollegeDetails(String _name, String _city){
		this.name = _name;
		this.city = _city;
		System.out.println("College Name:- "+name);
		System.out.println("City Name:- "+city);
	}

	CollegeDetails(String _name, String _city, int _ranking){
		this.name = _name;
		this.city = _city;
		this.ranking = _ranking;
		System.out.println("College Name:- "+name);
		System.out.println("City Name:- "+city);
		System.out.println("Ranking:- "+ranking);
	}
}
