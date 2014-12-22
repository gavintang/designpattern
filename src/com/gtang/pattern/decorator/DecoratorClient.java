package com.gtang.pattern.decorator;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.vehicle.Coupe;
import com.gtang.data.vehicle.Vehicle;

public class DecoratorClient {

	public static void main(String[] args) {
		
		Vehicle coupe = new Coupe(new StandardEngine(1000));
		
		coupe = new AirConditionedVehicle(coupe);
		coupe = new AlloyWheeledVehicle(coupe);
		coupe = new LeatherSeatedVehicle(coupe);
		coupe = new MetallicPaintedVehicle(coupe);
		coupe = new SatNavVehicle(coupe);
		
		System.out.println(coupe.getPrice());
	}

}
