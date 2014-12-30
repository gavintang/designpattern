package com.gtang.pattern.visitor;

import com.gtang.data.engine.Engine;

public class EngineDiagnostics implements EngineVisitor {

    @Override
    public void visit (Camshaft camshaft) {

        System.out.println("Diagnostics the camshaft");
    }

    @Override
    public void visit (Piston piston) {

        System.out.println("Diagnostics the piston");
    }

    @Override
    public void visit (SparkPlug sparkPlug) {

        System.out.println("Diagnostics the sparkPlug");
    }

    @Override
    public void visit (Engine engine) {

        System.out.println("Diagnostics the unit engine");
    }

}
