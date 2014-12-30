package com.gtang.pattern.visitor;

public class Camshaft implements Visitable {

    @Override
    public void acceptEngineVisitor (EngineVisitor visitor) {

        visitor.visit(this);
    }
}
