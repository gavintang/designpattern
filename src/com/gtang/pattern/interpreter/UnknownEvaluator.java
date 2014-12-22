package com.gtang.pattern.interpreter;

import java.util.Stack;

public class UnknownEvaluator implements Evaluator {

	@Override
	public void evaluate(Stack<Expression> expresses, String token) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setNextEvaluator(Evaluator nextEvaluator) {
		throw new UnsupportedOperationException();
	}
	
}
