
package com.gtang.pattern.composite;

public class CarBody extends Part {

	@Override
	public String getDescription() {
		return "Car Body"; 
	}
	
	@Override
	public int getCost() {
		return 2;
	}

}
