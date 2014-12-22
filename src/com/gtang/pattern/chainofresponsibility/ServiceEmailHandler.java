package com.gtang.pattern.chainofresponsibility;

public class ServiceEmailHandler extends AbstractEmailHandler {

	@Override
	protected String[] getMatchingWords() {
		return new String[] {"service", "repair"};
	}

	@Override
	protected void doProcess(String email) {
		System.out.println("Email is handled by service department.");
	}
}
