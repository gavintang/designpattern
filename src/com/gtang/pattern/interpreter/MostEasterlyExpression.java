package com.gtang.pattern.interpreter;

import java.util.List;

public class MostEasterlyExpression implements Expression {

	public MostEasterlyExpression(List<Expression> expressions) {
		this.expressions = expressions;
	}
	
	@Override
	public City interpret() {
		
		City resultingCity = new City("Nowhere", -999.9, -999.9);
		
		for (Expression currentExpression : expressions) {
			
			City currentCity = currentExpression.interpret();
			if(resultingCity.getLongitude() < currentCity.getLongitude()) {
				
				resultingCity = currentCity;
			}
		}
		
		return resultingCity;
	}

	private List<Expression> expressions;
}
