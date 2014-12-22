package com.gtang.data.diagnostic;

public class EngineDiagnosticTool implements DiagnosticTool {

	@Override
	public void runDiagnosis(Object object) {

		System.out.println("Starting engine diagnostic tool for " + object);
		
		try {
			Thread.sleep(5000);
			System.out.println("Engine diagnosis complete " + object);
		} catch (InterruptedException e) {
			System.out.println("Engine diagnosis interrupted "  + object);
		}

	}

}
