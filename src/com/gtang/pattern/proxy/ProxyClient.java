package com.gtang.pattern.proxy;

import com.gtang.data.diagnostic.DiagnosticTool;
import com.gtang.data.diagnostic.EngineDiagnosticTool;
import com.gtang.data.engine.Engine;

public class ProxyClient {

	public static void main (String[] args) {
				
		DiagnosticTool diagnosticTool = new EngineDiagnosticTool();
		
		Engine engineA = new EngineProxy(1200, true);
		engineA.diagnose(diagnosticTool);

		Engine engineB = new EngineProxy(1500, true);
		engineB.diagnose(diagnosticTool);
		
		Engine engineC = new EngineProxy(1000, false);
		engineC.diagnose(diagnosticTool);
	}
}
