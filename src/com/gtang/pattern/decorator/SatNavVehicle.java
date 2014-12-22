package com.gtang.pattern.decorator;

import com.gtang.data.vehicle.Vehicle;

public class SatNavVehicle extends AbstractVehicleOption {

	public SatNavVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		
		System.out.println("Get price of Sat Nav, 100.");
		return getDecoratedVehicle().getPrice() + 100;
	}
	
}
