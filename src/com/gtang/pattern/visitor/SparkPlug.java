package com.gtang.pattern.visitor;

public class SparkPlug implements Visitable {

    @Override
    public void acceptEngineVisitor (EngineVisitor visitor) {

        visitor.visit(this);
    }
}
