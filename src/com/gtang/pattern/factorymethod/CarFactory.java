
package com.gtang.pattern.factorymethod;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.engine.TurboEngine;
import com.gtang.data.vehicle.Coupe;
import com.gtang.data.vehicle.Saloon;
import com.gtang.data.vehicle.Sport;
import com.gtang.data.vehicle.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    protected Vehicle selectVehicle (DrivingStyle style) {

        Vehicle v = null;

        switch (style) {

            case MIDRANGE:
                v = buildMidrangeCar();
                break;
            case POWERFUL:
                v = buildPowerfulCar();
                break;
            case ECOMONICAL:
            default:
                v = buildEconomicalCar();
                break;
        }

        return v;
    }

    private static Vehicle buildEconomicalCar () {

        return new Saloon(new StandardEngine(1300));
    }

    private static Vehicle buildMidrangeCar () {

        return new Coupe(new StandardEngine(1600));
    }

    private static Vehicle buildPowerfulCar () {

        return new Sport(new TurboEngine(2000));
    }

}
