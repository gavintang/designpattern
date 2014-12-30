package com.gtang.pattern.strategy;

import com.gtang.data.engine.Engine;


public interface GearboxStrategy {

    public void ensureCorrectGear(Engine engine, int speed);
}
