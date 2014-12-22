package com.gtang.pattern.chainofresponsibility;

public class SpamEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] getMatchingWords() {
		return new String[] {"viagra", "pills", "medicines"};
	}

	@Override
	protected void doProcess(String email) {
		System.out.println("This is a spam email.");
	}

}
