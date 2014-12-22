package com.gtang.pattern.interpreter;

import java.util.Stack;

public class DefaultEvaluator implements Evaluator {
	
	public final static Evaluator DEFAULT_EVALUATOR = new CityEvaluator();
	
	public static City startEvaluate (String route) {
		
		DefaultEvaluator evaluator = new DefaultEvaluator();
		
		Stack <Expression> expresses = new Stack <Expression> ();
		
		for (String token : route.split(" ")) {
			
			evaluator.evaluate(expresses, token);
			
		}
		
		return expresses.pop().interpret();
		
	}
	
	public DefaultEvaluator () {
		setNextEvaluator(DEFAULT_EVALUATOR);
	}
	
	@Override
	public void evaluate(Stack <Expression> expresses, String token) {

		nextEvaluator.evaluate(expresses, token);
	}

	@Override
	public void setNextEvaluator(Evaluator nextEvaluator) {
		this.nextEvaluator = nextEvaluator;
	}

	private Evaluator nextEvaluator;
}
