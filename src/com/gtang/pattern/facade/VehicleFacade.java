package com.gtang.pattern.facade;

import com.gtang.data.vehicle.Documentation;
import com.gtang.data.vehicle.Registration;
import com.gtang.data.vehicle.Vehicle;

public class VehicleFacade {
	
	public void prepareForSale (Vehicle vehicle) {
		
		Registration reg = new Registration(vehicle);
		reg.allocateLicensePlate();
		reg.allocateVehicleNumber();
		
		Documentation.printBrochure(vehicle);
		
		vehicle.cleanExteriorBody();
		vehicle.cleanInterior();
		vehicle.polishWindows();
		vehicle.takeForTestDrive();
		
	}

}
