package com.kodewala.encapsulation.hospital;

public class Driver {
	public static void main(String[] args) {
		PatientDetails pd = new PatientDetails("PAT7GT4556", "Mohan Kumar", "Fever,cold&cough", 33);
		pd.displayPatientDetails();
		
		pd.setAge(23);
		pd.setDisease("Diarriah");
		pd.setId("PUNB56GHT786");
		pd.setName("Sohan Kumar");
		pd.displayPatientDetails();
	}
}
