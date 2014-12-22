package com.gtang.pattern.bridge;

import com.gtang.data.engine.Engine;

public abstract class AbstractDriverControls implements DriverControls {

	private Engine engine;
	
	public AbstractDriverControls (Engine engine) {
		
		this.engine = engine;
	}
	
	@Override
	public void ignitionOn() {
		engine.start();
	}
	
	@Override
	public void ignitionOff() {
		engine.stop();
	}
	
	@Override
	public void accelerate() {
		engine.increasePower();
	}
	
	@Override
	public void brake () {
		engine.decreasePower();
	}
}
