package com.gtang.pattern.proxy;

import com.gtang.data.diagnostic.DiagnosticTool;
import com.gtang.data.engine.Engine;
import com.gtang.data.engine.StandardEngine;
import com.gtang.data.engine.TurboEngine;

public class EngineProxy implements Engine {
	
	public EngineProxy(int size, boolean isTurbo) {

		if (isTurbo) {
			engine = new TurboEngine(size);
		} else {
			engine = new StandardEngine(size);
		}
	}

	@Override
	public int getSize() {
		return engine.getSize();
	}

	@Override
	public boolean isTurbo() {
		return engine.isTurbo();
	}

	@Override
	public void diagnose(final DiagnosticTool diagnosticTool) {
		
		Thread t = new Thread (new Runnable() {

			@Override
			public void run() {
				System.out.println("(Running tool as a new thread)");
				engine.diagnose(diagnosticTool);
			}
			
		});
		
		t.start();
	}

	@Override
	public void start() {
		engine.start();
	}

	@Override
	public void stop() {
		engine.stop();
	}

	@Override
	public void increasePower() {
		engine.increasePower();
	}

	@Override
	public void decreasePower() {
		engine.decreasePower();
	}

	public Engine getEngine() {
		return engine;
	}
	
	private Engine engine;
	
}
