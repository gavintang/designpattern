package com.gtang.pattern.bridge;

import com.gtang.data.engine.Engine;
import com.gtang.data.engine.StandardEngine;

public class Client {

	public static void main(String[] args) {

		Engine engine = new StandardEngine(1300);
		StandardControls standardControls = new StandardControls (engine);
		
		standardControls.ignitionOn();
		standardControls.accelerate();
		standardControls.brake();
		standardControls.ignitionOff();
		
		SportControls sportControls = new SportControls(engine);
		sportControls.ignitionOn();
		sportControls.accelerate();
		sportControls.accelerateHard();
		sportControls.brake();
		sportControls.ignitionOff();
		
	}

}
