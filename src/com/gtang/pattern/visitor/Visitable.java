package com.gtang.pattern.visitor;

public interface Visitable {

    public void acceptEngineVisitor(EngineVisitor visitor);
}
