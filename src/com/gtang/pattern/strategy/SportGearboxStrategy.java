package com.gtang.pattern.strategy;

import com.gtang.data.engine.Engine;


public class SportGearboxStrategy implements GearboxStrategy {

    @Override
    public void ensureCorrectGear (Engine engine, int speed) {

        int engineSize = engine.getSize();
        boolean turbo = engine.isTurbo();

        System.out.println("Working out correct gear at " + speed + " mph for a SPORT gearbox");
    }

}
