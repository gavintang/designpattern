package com.gtang.pattern.decorator;

import com.gtang.data.vehicle.Vehicle;

public class AirConditionedVehicle extends AbstractVehicleOption {

	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
	}

	@Override
	public int getPrice() {
		
		System.out.println("Get price of Air Condition, 500.");
		return getDecoratedVehicle().getPrice() + 500;
	}
	
	public void setTemperature () {
		System.out.println("set temperature of Air Conditioned Vehicle");
	}

}
