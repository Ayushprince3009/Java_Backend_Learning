package com.kodewala.streamAPI.practice3;

import java.util.Arrays;
import java.util.List;

public class Driver5 {
	 public static void main(String[] args) {
		 List<String> names = Arrays.asList(
				    "ram", "rahul", "ayush", "amit", "rohit"
				);
		 
		  names.stream()
				 .map(n -> n.toUpperCase())
				 .forEach(n -> System.out.println(n));
	}
}
