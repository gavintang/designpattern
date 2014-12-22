
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;

public abstract class AbstractVan extends AbstractVehicle {

    AbstractVan (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    AbstractVan (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
    }

}
