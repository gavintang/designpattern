package com.gtang.pattern.chainofresponsibility;

public class GeneralEnquiriesEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] getMatchingWords() {
		return new String[] {};
	}

	@Override
	protected void doProcess(String email) {
		System.out.println("This is a general enquiries email.");
	}
	
}
