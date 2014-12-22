package com.gtang.pattern.mediator;

public class Accelerator {

	private EngineManagementSystem mediator;
	private boolean enabled;
	private int speed;
	
	public Accelerator (EngineManagementSystem mediator) {
		
		enabled = false;
		speed = 0;
		this.mediator = mediator;
		
		mediator.registerAccelerator(this);
	}
	
	public void enable() {
		
		this.enabled = true;
		mediator.acceleratorEnabled();
		System.out.println("Accelerator enabled");
	}
	
	public void disable() {
		
		this.enabled = false;
		mediator.acceleratorDisabled();
		System.out.println("Accelerator disabled");
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void accelerateToSpeed(int speed) {
		if (isEnabled()) {
			
			this.speed = speed;
			mediator.acceleratorPressed();
			System.out.println("Speed now " + getSpeed());
			
		}
	}
	
	public int getSpeed () {
		return speed;
	}
}
