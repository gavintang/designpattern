package com.gtang.pattern.interpreter;

public class CityExpression implements Expression {

	public CityExpression (City city) {
		this.city = city;
	}
	
	@Override
	public City interpret() {
		return city;
	}

	private City city;
	
}
