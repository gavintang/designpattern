package com.gtang.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CityEvaluator implements Evaluator {
	
	public final static Evaluator DEFAULT_EVALUATOR = new NortherlyEvaluator();
	
	public CityEvaluator () {
		setNextEvaluator(DEFAULT_EVALUATOR);
	}

	@Override
	public void evaluate(Stack <Expression> expresses, String token) {

		if(isCity(token)) {
			expresses.push(new CityExpression(CITIES.get(token)));
		} else {
			nextEvaluator.evaluate(expresses, token);
		}		
	}

	@Override
	public void setNextEvaluator(Evaluator nextEvaluator) {
		this.nextEvaluator = nextEvaluator;
	}

	public boolean isCity(String token) {
		return CITIES.containsKey(token);
	}
	
	private static Map <String, City> CITIES;
	
	static {
		
		CITIES = new HashMap <String, City> ();
		
		CITIES.put("aberdeen", new City("Aberdeen", 57.15, -2.15));
		CITIES.put("belfast", new City("Belfast", 54.62, -5.93));
		CITIES.put("birmingham", new City("Birmingham", 52.42, -1.92));
		CITIES.put("dublin", new City("Dublin", 53.33, -6.25));
		CITIES.put("edinburgh", new City("Edinburgh", 55.92, -3.02));
		CITIES.put("glasgow", new City("Glasgow", 55.83, -4.25));
		CITIES.put("london", new City("London", 51.53, -0.08));
		CITIES.put("liverpool", new City("Liverpool", 53.42, -3.0));
		CITIES.put("manchester", new City("Manchester", 53.5, -2.25));
		CITIES.put("southamption", new City("Southamption", 50.9, -1.38));
	}

	private Evaluator nextEvaluator;
}
