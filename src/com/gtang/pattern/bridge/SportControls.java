package com.gtang.pattern.bridge;

import com.gtang.data.engine.Engine;

public class SportControls extends AbstractDriverControls {

	public SportControls(Engine engine) {
		super(engine);
	}

	public void accelerateHard() {
		this.accelerate();
		this.accelerate();
	}
}
