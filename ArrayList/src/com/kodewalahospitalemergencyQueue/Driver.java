package com.kodewalahospitalemergencyQueue;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<String>patients = new ArrayList<String>();
		patients.add("Amit");
		patients.add("Rahul");
		patients.add("Priya");
		patients.add("Neha");
		patients.add("Karan");
		patients.add("Rahul");
		
		System.out.println(patients);
		
		patients.remove("Priya");
		patients.add(0,"Priya");
		System.out.println(patients);
		
		patients.add("Viaksh");
		System.out.println(patients);
		
		patients.set(patients.indexOf("Neha"), "Anjali");
		System.out.println(patients);
		patients.remove(patients.lastIndexOf("Rahul"));
		System.out.println(patients);
		patients.remove(0);
		System.out.println(patients);
		//System.out.println(patients.getFirst());
		//System.out.println(patients.getLast());
		System.out.println(patients.contains("Karan"));
		System.out.println(patients.size());
		System.out.println(patients.isEmpty());
	}
}
