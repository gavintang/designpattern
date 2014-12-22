
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;

public abstract class AbstractCar extends AbstractVehicle {

    AbstractCar (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    AbstractCar (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
    }

}
