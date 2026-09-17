/*Create a Hospital class.

Default constructor prints:
"No details available"
Parameterized constructor prints hospital details.
Create both types of objects.*/

package com.kodewala.object.constructor.learning;

public class Hospital {

	public static void main(String[] args) {
		HospitalDetails hos1 = new HospitalDetails();
		HospitalDetails hos2 = new HospitalDetails("fhdfhd", "dfdhf", 50);

	}

}

class HospitalDetails{
	private String patentName;
	private String problem;
	private int days;
	
	HospitalDetails(){
		System.out.println("No details Available");
	}
	
	HospitalDetails(String _name, String _problem, int _days){
		this.patentName = _name;
		this.problem = _problem;
		this.days = _days;
		System.out.println(patentName);
		System.out.println(problem);
		System.out.println(days);
		
	}
}
