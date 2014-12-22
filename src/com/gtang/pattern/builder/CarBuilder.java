
package com.gtang.pattern.builder;

import com.gtang.data.vehicle.AbstractCar;

public class CarBuilder extends AbstractVehicleBuilder {

    public CarBuilder (AbstractCar car) {

        super(car);
    }

    @Override
    public VehicleBuilder buildChassis () {

        System.out.println("building car Vhassis");

        return this;
    }

    @Override
    public VehicleBuilder buildBody () {

        System.out.println("building car Body");

        return this;
    }

    @Override
    public VehicleBuilder buildPassengerArea () {

        System.out.println("building car passenger area");

        return this;
    }

    @Override
    public VehicleBuilder buildBoot () {

        System.out.println("building car boot");

        return this;
    }

    @Override
    public VehicleBuilder buildWindows () {

        System.out.println("building car Windows");

        return this;
    }

}
