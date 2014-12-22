
package com.gtang.pattern.composite;

public class CarChassis extends Part {

	@Override
	public String getDescription() {
		return "Car Chassis"; 
	}
	
	@Override
	public int getCost() {
		return 1;
	}

}
