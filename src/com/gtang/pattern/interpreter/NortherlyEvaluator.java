package com.gtang.pattern.interpreter;

import java.util.Stack;

public class NortherlyEvaluator extends DirectionalEvaluator {
	
	public final static Evaluator DEFAULT_EVALUATOR = new SoutherlyEvaluator();
	
	public NortherlyEvaluator () {
		setNextEvaluator(DEFAULT_EVALUATOR);
	}

	@Override
	public Expression doEvaluate(Stack <Expression> expresses, String token) {

		return new MostNortherlyExpression(loadExpressions(expresses));
	}

	@Override
	public boolean isMatchingToken(String token) {
		return "northerly".equals(token);
	}
	
}
