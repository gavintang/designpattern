package com.gtang.pattern.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class DirectionalEvaluator implements Evaluator {
	
	protected List<Expression> loadExpressions (Stack <Expression> expressionStack) {
		
		List<Expression> expressions = new ArrayList<Expression> ();
		
		while(!expressionStack.isEmpty()) {
			expressions.add(expressionStack.pop());
		}
		
		return expressions;
	}

	@Override
	public void evaluate(Stack <Expression> expresses, String token) {

		if(isMatchingToken(token)) {
			expresses.push(doEvaluate(expresses, token));
		} else {
			nextEvaluator.evaluate(expresses, token);
		}
		
	}
	
	@Override
	public void setNextEvaluator(Evaluator nextEvaluator) {
		this.nextEvaluator = nextEvaluator;
	}
	
	public abstract Expression doEvaluate(Stack <Expression> expresses, String token);
	public abstract boolean isMatchingToken(String token);
	
	private Evaluator nextEvaluator;

}
