package com.gtang.pattern.facade;

import com.gtang.data.vehicle.Vehicle;
import com.gtang.pattern.factorymethod.CarFactory;
import com.gtang.pattern.factorymethod.VehicleFactory;

public class FacadeClient {
	
	public static void main(String[] args) {
		
		VehicleFactory factory = new CarFactory();
		Vehicle vehicle = factory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.BLUE);
		
		VehicleFacade facade = new VehicleFacade();
		facade.prepareForSale(vehicle);
	}
}
