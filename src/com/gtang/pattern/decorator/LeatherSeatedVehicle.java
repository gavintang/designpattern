package com.gtang.pattern.decorator;

import com.gtang.data.vehicle.Vehicle;

public class LeatherSeatedVehicle extends AbstractVehicleOption {

	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		
		System.out.println("Get price of Leather Seat, 300.");
		return getDecoratedVehicle().getPrice() + 300;
	}
	
}
