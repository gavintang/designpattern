package com.gtang.pattern.visitor;

import com.gtang.data.engine.Engine;

public interface EngineVisitor {

    public void visit(Camshaft camshaft);
    public void visit(Piston piston);
    public void visit(SparkPlug sparkPlug);
    public void visit(Engine engine);
    
}
