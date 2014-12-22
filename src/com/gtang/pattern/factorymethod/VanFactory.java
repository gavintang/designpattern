
package com.gtang.pattern.factorymethod;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.engine.TurboEngine;
import com.gtang.data.vehicle.AbstractVan;
import com.gtang.data.vehicle.BoxVan;
import com.gtang.data.vehicle.Pickup;
import com.gtang.data.vehicle.Vehicle;

public class VanFactory extends VehicleFactory {

    @Override
    protected Vehicle selectVehicle (DrivingStyle style) {

        Vehicle v = null;

        switch (style) {

            case POWERFUL:
                v = buildPowerfulVan();
                break;
            case ECOMONICAL:
            case MIDRANGE:
            default:
                v = buildEconomicalOrMidrangeVan();
                break;
        }

        return v;
    }

    private static AbstractVan buildEconomicalOrMidrangeVan () {

        return new Pickup(new StandardEngine(2200));
    }

    private static AbstractVan buildPowerfulVan () {

        return new BoxVan(new TurboEngine(2500));
    }

}
