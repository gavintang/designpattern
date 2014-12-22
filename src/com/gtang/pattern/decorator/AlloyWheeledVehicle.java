package com.gtang.pattern.decorator;

import com.gtang.data.vehicle.Vehicle;

public class AlloyWheeledVehicle extends AbstractVehicleOption {

	public AlloyWheeledVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		
		System.out.println("Get price of Alloy Wheel, 400.");
		return getDecoratedVehicle().getPrice() + 400;
	}
	
}
