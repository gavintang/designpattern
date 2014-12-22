package com.gtang.data.vehicle;

public class Registration {
		
	public Registration(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void allocateLicensePlate () {
		System.out.println(String.format("%s, License plate allocated", vehicle));
	}
	
	public void allocateVehicleNumber () {
		System.out.println(String.format("%s, Vehicle number allocated", vehicle));
	}
	
	private Vehicle vehicle;

}
