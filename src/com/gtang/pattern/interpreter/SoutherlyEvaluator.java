package com.gtang.pattern.interpreter;

import java.util.Stack;

public class SoutherlyEvaluator extends DirectionalEvaluator {
	
	public final static Evaluator DEFAULT_EVALUATOR = new WesterlyEvaluator();
	
	public SoutherlyEvaluator () {
		setNextEvaluator(DEFAULT_EVALUATOR);
	}

	@Override
	public Expression doEvaluate(Stack <Expression> expresses, String token) {

		return new MostSoutherlyExpression(loadExpressions(expresses));
	}

	@Override
	public boolean isMatchingToken(String token) {
		return "southerly".equals(token);
	}
}
