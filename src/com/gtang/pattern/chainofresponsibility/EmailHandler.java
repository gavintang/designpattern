package com.gtang.pattern.chainofresponsibility;

public interface EmailHandler {

	public void setNextHandler(EmailHandler handler);
	public void process(String email);
}
