package com.gtang.pattern.visitor;

import com.gtang.data.engine.Engine;
import com.gtang.data.engine.StandardEngine;

public class VisitorClient {

    public static void main(String[] args) {
        
        Engine engine = new StandardEngine(1300);
        engine.acceptEngineVisitor(new EngineDiagnostics());
    }
    
}
