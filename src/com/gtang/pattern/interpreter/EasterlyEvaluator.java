package com.gtang.pattern.interpreter;

import java.util.Stack;

public class EasterlyEvaluator extends DirectionalEvaluator {
	
	public final static Evaluator DEFAULT_EVALUATOR = new UnknownEvaluator();
	
	public EasterlyEvaluator () {
		setNextEvaluator(DEFAULT_EVALUATOR);
	}

	@Override
	public Expression doEvaluate(Stack <Expression> expresses, String token) {

		return new MostEasterlyExpression(loadExpressions(expresses));
	}

	@Override
	public boolean isMatchingToken(String token) {
		return "easterly".equals(token);
	}
}
