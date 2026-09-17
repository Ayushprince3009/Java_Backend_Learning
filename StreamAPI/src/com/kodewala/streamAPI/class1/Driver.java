package com.kodewala.streamAPI.class1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Ayush","Bikash","Binod","Ashutosh","Aman","Tawrej","Ritesh","Abhishek");
		
//		//convert to collection
//		Stream<String> inputName = name.stream();
//		
//		//filter part
//		Stream<String> filteredName = inputName.filter(nameA -> nameA.startsWith("A"));
//		
//		//print part
//		List<String> nameStartsWithA = filteredName.collect(Collectors.toList());
//		System.out.println(nameStartsWithA);
//		
//		
//		//one line code 
//		List<String> nameEndsWithH = name.stream().filter(lastWord -> lastWord.endsWith("h")).collect(Collectors.toList());
//		System.out.println(nameEndsWithH);
		
		
		List<String> output = name.stream()
				.filter(n -> n.startsWith("A"))
				.map(w -> w.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		List<String> output1 = name.stream()
				.filter(n -> n.endsWith("d"))
				.map(w -> w.toLowerCase())
				.collect(Collectors.toList());
		
		System.out.println(output1);
		
		List<String> output2 = name.stream()
				.filter(a -> a.equalsIgnoreCase("Binod"))
				.map(q -> q.concat("abx"))
				.collect(Collectors.toList());
		
		System.out.println(output2);

	}
}