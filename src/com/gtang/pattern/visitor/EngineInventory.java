package com.gtang.pattern.visitor;

import com.gtang.data.engine.Engine;

public class EngineInventory implements EngineVisitor {

    @Override
    public void visit (Camshaft camshaft) {

        System.out.println("Inventory the camshaft");
    }

    @Override
    public void visit (Piston piston) {

        System.out.println("Inventory the piston");
    }

    @Override
    public void visit (SparkPlug sparkPlug) {

        System.out.println("Inventory the sparkPlug");
    }

    @Override
    public void visit (Engine engine) {

        System.out.println("Inventory the unit engine");
    }

}
