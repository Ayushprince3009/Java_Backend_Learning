package com.kodewala.multipleinterfaace.pq1;

public class Driver4 {
	public static void main(String[] args) {
		HybridVehicle ev = new HybridVehicle("fuel");
		ev.startEngine();
		ev.speed();
		
	}
}

interface ElectricVehicle{
	
	default void startEngine() {
		System.out.println("Electric Vehicle Started");
	}
}

interface FuelVehicle{
	default void startEngine() {
		System.out.println("Fuel Vehicle Started");
	}
}

class HybridVehicle implements ElectricVehicle, FuelVehicle{
	private String vehicleType;
	
	public HybridVehicle(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	@Override
	public void startEngine() {
		if(vehicleType.equalsIgnoreCase("electric")) {
			ElectricVehicle.super.startEngine();
		}
		else if(vehicleType.equalsIgnoreCase("fuel")) {
			FuelVehicle.super.startEngine();
		}
	}
	
	 public void speed() {
		System.out.println("High Speed Vehicle");
	}
	
}