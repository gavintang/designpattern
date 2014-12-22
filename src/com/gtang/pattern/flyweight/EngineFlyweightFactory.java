package com.gtang.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.engine.TurboEngine;

public class EngineFlyweightFactory {

	public EngineFlyweightFactory () {
		
		standardEnginePool = new HashMap<Integer, StandardEngine>();
		turboEnginePool = new HashMap<Integer, TurboEngine>();
	}
	
	public StandardEngine getStandardEngine (int size) {
		
		if(standardEnginePool.get(size) == null) {
			standardEnginePool.put(size, new StandardEngine(size));
		}
		
		return standardEnginePool.get(size);
	}
	
	public TurboEngine getTurboEngine (int size) {
		
		if(turboEnginePool.get(size) == null) {
			turboEnginePool.put(size, new TurboEngine(size));
		}
		
		return turboEnginePool.get(size);
	}
	
	private Map <Integer, StandardEngine> standardEnginePool;
	private Map <Integer, TurboEngine> turboEnginePool;
	
}
