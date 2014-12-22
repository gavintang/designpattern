package com.gtang.pattern.decorator;

import com.gtang.data.vehicle.Vehicle;

public class MetallicPaintedVehicle extends AbstractVehicleOption {

	public MetallicPaintedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		
		System.out.println("Get price of Metallic Paint, 200.");
		return getDecoratedVehicle().getPrice() + 200;
	}
	
}
