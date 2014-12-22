
package com.gtang.pattern.prototype;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.vehicle.BoxVan;
import com.gtang.data.vehicle.Coupe;
import com.gtang.data.vehicle.Pickup;
import com.gtang.data.vehicle.Saloon;
import com.gtang.data.vehicle.Sport;
import com.gtang.data.vehicle.Vehicle;

public class VehicleManagerLazy {

    private BoxVan boxVan;
    private Coupe coupe;
    private Pickup pickup;
    private Saloon saloon;
    private Sport sport;

    public Vehicle createBoxVan () {

        if (boxVan == null) {
            boxVan = new BoxVan(new StandardEngine(1300));
        }
        return (Vehicle) boxVan.copy();
    }

    public Vehicle createCoupe () {

        if (coupe == null) {
            coupe = new Coupe(new StandardEngine(1300));
        }
        return (Vehicle) coupe.copy();
    }

    public Vehicle createPickup () {

        if (pickup == null) {
            pickup = new Pickup(new StandardEngine(1300));
        }
        return (Vehicle) pickup.copy();
    }

    public Vehicle createSoloon () {

        if (saloon == null) {
            saloon = new Saloon(new StandardEngine(1300));
        }
        return (Vehicle) saloon.copy();
    }

    public Vehicle createSport () {

        if (sport == null) {
            sport = new Sport(new StandardEngine(1300));
        }
        return (Vehicle) sport.copy();

    }

}
