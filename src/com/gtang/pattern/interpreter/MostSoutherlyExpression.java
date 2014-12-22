package com.gtang.pattern.interpreter;

import java.util.List;

public class MostSoutherlyExpression implements Expression {

	public MostSoutherlyExpression(List<Expression> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public City interpret() {
		
		City resultingCity = new City("Nowhere", 999.9, 999.9);
		
		for (Expression currentExpression : expressions) {
			
			City currentCity = currentExpression.interpret();
			if(resultingCity.getLatitude() > currentCity.getLatitude()) {
				
				resultingCity = currentCity;
			}
		}
		
		return resultingCity;
	}

	private List<Expression> expressions;
}
