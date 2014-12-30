
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;
import com.gtang.pattern.strategy.GearboxStrategy;
import com.gtang.pattern.strategy.StandardGearboxStrategy;

public abstract class AbstractCar extends AbstractVehicle {

    AbstractCar (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    AbstractCar (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
        gearboxStrategy = new StandardGearboxStrategy();
    }
    
    public GearboxStrategy getGearboxStrategy () {
    
        return gearboxStrategy;
    }

    public void setGearboxStrategy (GearboxStrategy gearboxStrategy) {
    
        this.gearboxStrategy = gearboxStrategy;
    }
    
    public void setSpeed (int speed) {
        
        this.gearboxStrategy.ensureCorrectGear(getEngine(), speed);
    }

    private GearboxStrategy gearboxStrategy;

}
