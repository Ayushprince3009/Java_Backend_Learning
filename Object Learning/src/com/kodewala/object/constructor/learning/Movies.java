/*Create a Movie class.

Fields:
movieName
rating
Create three movie objects with different values.*/
package com.kodewala.object.constructor.learning;

public class Movies {

	public static void main(String[] args) {
		MovieDetails mov1 = new MovieDetails("xcxbnbd", 5);
		MovieDetails mov2 = new MovieDetails("shfdsf", 8);

	}

}

class MovieDetails{
	private String name;
	private int rating;
	
	MovieDetails(){
		
	}
	
	MovieDetails(String _name, int _rating){
		this.name = _name;
		this.rating = _rating;
	}
}