package com.gtang.pattern.mediator;

public class MediatorClient {
	
	public static void main (String[] args) {
		
		EngineManagementSystem ems = new EngineManagementSystem();
		Ignition ignition = new Ignition(ems);
		Gearbox gearbox = new Gearbox(ems);
		Accelerator accelerator = new Accelerator(ems);
		Brake brake = new Brake(ems);
		
		ignition.start();
		accelerator.accelerateToSpeed(15);
		accelerator.accelerateToSpeed(42);
		
		brake.apply();
		brake.release();
	}
	
}
