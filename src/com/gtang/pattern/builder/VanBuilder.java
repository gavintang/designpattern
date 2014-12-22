
package com.gtang.pattern.builder;

import com.gtang.data.vehicle.AbstractVan;

public class VanBuilder extends AbstractVehicleBuilder {

    public VanBuilder (AbstractVan van) {

        super(van);
    }

    @Override
    public VehicleBuilder buildChassis () {

        System.out.println("building van Vhassis");

        return this;
    }

    @Override
    public VehicleBuilder buildBody () {

        System.out.println("building van Body");

        return this;
    }

    @Override
    public VehicleBuilder buildWindows () {

        System.out.println("building van Windows");

        return this;
    }

}
