package com.gtang.pattern.interpreter;

public class InterpreterClient {

	public static void main(String[] args) {
		
		System.out.println(DefaultEvaluator.startEvaluate("london edinburgh manchester southerly")); 
		
		System.out.println(DefaultEvaluator.startEvaluate("london edinburgh manchester southerly aberdeen westerly"));  
		
	}
	
}
