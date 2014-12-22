
package com.gtang.pattern.composite;

public class CarWindows extends Part {

	@Override
	public String getDescription() {
		return "Car Windows"; 
	}
	
	@Override
	public int getCost() {
		return 3;
	}

}
