package com.gtang.pattern.decorator;

import com.gtang.data.vehicle.AbstractVehicle;
import com.gtang.data.vehicle.Vehicle;

public abstract class AbstractVehicleOption extends AbstractVehicle {

	private Vehicle decoratedVehicle;
	
	public AbstractVehicleOption(Vehicle vehicle) {
		
		super(vehicle.getEngine());
		this.decoratedVehicle = vehicle;
	}

	Vehicle getDecoratedVehicle(){
		return decoratedVehicle;
	}
}
