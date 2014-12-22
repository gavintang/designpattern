package com.gtang.pattern.interpreter;

import java.util.Stack;

public class WesterlyEvaluator extends DirectionalEvaluator {
	
	public final static Evaluator DEFAULT_EVALUATOR = new EasterlyEvaluator();
	
	public WesterlyEvaluator () {
		setNextEvaluator(DEFAULT_EVALUATOR);
	}

	@Override
	public Expression doEvaluate(Stack <Expression> expresses, String token) {

		return new MostWesterlyExpression(loadExpressions(expresses));
	}

	@Override
	public boolean isMatchingToken(String token) {
		return "westerly".equals(token);
	}
}
