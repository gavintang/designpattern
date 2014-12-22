package com.gtang.pattern.mediator;

public class Gearbox {
	
	public static enum Gear {
		NEUTRAL, FIRST, SECOND, THIRD, FOURTH, FIFTH, REVERSE;
	}

	private EngineManagementSystem mediator;
	private boolean enabled;
	private Gear currentGear;
	
	public Gearbox(EngineManagementSystem mediator) {
		
		this.mediator = mediator;
		enabled = false;
		currentGear = Gear.NEUTRAL;
		
		mediator.registerGearbox(this);
		
	}
	
	public void enable () {
		enabled = true;
		mediator.gearboxEnabled();
		
		System.out.println("Gearbox enabled");
	}
	
	public void disable () {
		enabled = false;
		mediator.gearboxDisabled();
		
		System.out.println("Gearbox disabled");
	}
	
	public boolean isEnabled () {
		return enabled;
	}
	
	public void setGear(Gear g) {
		if(isEnabled() && g != getGear()) {
			currentGear = g;
			mediator.gearChanged();
			System.out.println("Now in " + getGear() + " gear");
		}
	}
	
	public Gear getGear () {
		return currentGear;
	} 
	
}
