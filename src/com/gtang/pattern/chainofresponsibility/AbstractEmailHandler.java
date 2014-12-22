package com.gtang.pattern.chainofresponsibility;

public abstract class AbstractEmailHandler implements EmailHandler {

	public static void handle (String email) {
		
		EmailHandler spam = new SpamEmailHandler();
		EmailHandler sales = new SalesEmailHandler();
		EmailHandler service = new ServiceEmailHandler();
		EmailHandler general = new GeneralEnquiriesEmailHandler();
		
		spam.setNextHandler(sales);
		sales.setNextHandler(service);
		service.setNextHandler(general);
		
		spam.process(email);
		
	}
	
	@Override
	public void setNextHandler(EmailHandler handler) {
		this.handler = handler;
	}

	@Override
	public void process(String email) {
		
		boolean needProcessHere = isEmaiContainsMatchingWords(email);
		
		if(needProcessHere) {
			doProcess(email);
		} else {
			handler.process(email);
		}
	}

	protected abstract String[] getMatchingWords();
	protected abstract void doProcess(String email);
	
	private EmailHandler handler;
	
	private boolean isEmaiContainsMatchingWords(String email) {
		
		boolean wordFound = false;
		
		String[] matchingWords = getMatchingWords();
		
		if(matchingWords.length == 0) {
			wordFound = true;
		} else {
			for(String word : matchingWords) {
				if(email.contains(word)) {
					wordFound = true;
					break;
				}
			}
		}
		
		return wordFound;
	}
	
}
