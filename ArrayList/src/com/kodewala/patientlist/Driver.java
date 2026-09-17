package com.kodewala.patientlist;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<Patient>patients = new ArrayList<Patient>();
		patients.add(new Patient(101, "Ayush", 34, "fever"));
		patients.add(new Patient(102, "Rahul", 65, "diabetes"));
		patients.add(new Patient(103, "Priya", 45, "cold"));
		patients.add(new Patient(104, "Neha", 72, "heart"));
		patients.add(new Patient(105, "Karan", 28, "fever"));
		
		
//		for(Patient p : patients) {
//			System.out.println(p.getId());
//			System.out.println(p.getName());
//			System.out.println(p.getAge());
//			System.out.println(p.getDisease());
//			System.out.println();
//		}
//		
//		for(Patient x : patients) {
//			if(x.getAge() > 60) {
//				System.out.println(x.getName());
//			}
//		}
//		
//		for(Patient z : patients) {
//			if(z.getId() == 101) {
//				System.out.println(z.getName());
//			}
//		}
//		
//		for(Patient v : patients) {
//			if(v.getId() == 101) {
//				v.setDisease("Malaria");
//			}
//			
//			System.out.println(v.getDisease());
//		}
		
		for(int i=0; i<patients.size(); i++) {
			if(patients.get(i).getName().equalsIgnoreCase("Rahul")) {
				patients.remove(i);
				break;
			}
		}
		
		for(Patient p : patients) {
			System.out.println(p.getName());
		}
		
		
		
		
	}
}
