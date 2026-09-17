package com.kodewala.streamAPI.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {
	public static void main(String[] args) {
		List<String> city = Arrays.asList("Delhi","Chennai","Bangalore","Kochi","Patna","Pune","Noida");
		//convert to stream
		Stream<String> cities = city.stream();
		
		//apply filter
		Stream<String> filteredCity = cities.filter(citys -> citys.contains("e"));
		
		
		//for printing
		List<String> output = filteredCity.collect(Collectors.toList());
		
		System.out.println(output);
		System.out.println(output.size());
		
		//one line
		List<String> list = city.stream()
				.filter(citys -> citys.endsWith("i"))
				.collect(Collectors.toList());
		System.out.println(list);
		
	}
}
