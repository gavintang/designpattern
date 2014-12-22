package com.gtang.pattern.composite;

public class CompositeClient {

	public static void main (String[] args) {
		
		CarPartAssembly carAssembly = new CarPartAssembly();
		carAssembly.addItem(new CarBody());
		
		CarPartAssembly subCarAssembly1 = new CarPartAssembly();
		subCarAssembly1.addItem(new CarChassis());
		subCarAssembly1.addItem(new CarWindows());
		
		CarPartAssembly subCarAssembly2 = new CarPartAssembly();
		subCarAssembly2.addItem(new CarChassis());
		subCarAssembly2.addItem(new CarWindows());
		
		carAssembly.addItem(subCarAssembly1);
		carAssembly.addItem(subCarAssembly2);
		
		System.out.println(carAssembly.toString());
		System.out.println(carAssembly.getCost());
		
	}
	
}
