package com.gtang.pattern.interpreter;

import java.util.Stack;

public interface Evaluator {
	
	public void evaluate(Stack <Expression> expresses, String token);
	public void setNextEvaluator(Evaluator nextEvaluator);
	
}
