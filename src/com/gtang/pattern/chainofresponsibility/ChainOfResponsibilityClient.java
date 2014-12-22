package com.gtang.pattern.chainofresponsibility;

public class ChainOfResponsibilityClient {

	public static void main(String[] args) {
		
		String email = "I need my car repaired";
		AbstractEmailHandler.handle(email);

	}

}
