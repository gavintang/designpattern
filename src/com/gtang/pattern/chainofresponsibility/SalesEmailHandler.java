package com.gtang.pattern.chainofresponsibility;

public class SalesEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] getMatchingWords() {
		return new String[] {"buy", "purchase"};
	}

	@Override
	protected void doProcess(String email) {
		System.out.println("Email is handled by Sales department.");
	}

}
