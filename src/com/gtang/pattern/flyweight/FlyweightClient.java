package com.gtang.pattern.flyweight;

import com.gtang.data.diagnostic.DiagnosticTool;
import com.gtang.data.diagnostic.EngineDiagnosticTool;
import com.gtang.data.engine.Engine;

public class FlyweightClient {

	public static void main (String[] args) {
		
		EngineFlyweightFactory engineFactory = new EngineFlyweightFactory();
		
		DiagnosticTool diagnosticTool = new EngineDiagnosticTool();
		
		Engine engineA = engineFactory.getStandardEngine(1000);
		engineA.diagnose(diagnosticTool);

		Engine engineB = engineFactory.getStandardEngine(1000);
		engineB.diagnose(diagnosticTool);
		
		Engine engineC = engineFactory.getStandardEngine(1000);
		engineC.diagnose(diagnosticTool);
		
		Engine engineD = engineFactory.getStandardEngine(1100);
		engineD.diagnose(diagnosticTool);
		
		Engine engineE = engineFactory.getTurboEngine(1500);
		engineE.diagnose(diagnosticTool);
		
		Engine engineF = engineFactory.getStandardEngine(1100);
		engineF.diagnose(diagnosticTool);
		
		Engine engineG = engineFactory.getTurboEngine(1500);
		engineG.diagnose(diagnosticTool);
		
	}
	
}
