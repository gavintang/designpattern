
package com.gtang.pattern.builder;

import com.gtang.data.vehicle.Vehicle;

abstract class AbstractVehicleBuilder implements VehicleBuilder {

    private Vehicle vehicle;

    public AbstractVehicleBuilder (Vehicle vehicle) {

        this.vehicle = vehicle;
    }

    @Override
    public VehicleBuilder buildChassis () {

        System.out.println("Do nothing!");

        return this;
    };

    @Override
    public VehicleBuilder buildBody () {

        System.out.println("Do nothing!");

        return this;
    };

    @Override
    public VehicleBuilder buildPassengerArea () {

        System.out.println("Do nothing!");

        return this;
    };

    @Override
    public VehicleBuilder buildBoot () {

        System.out.println("Do nothing!");

        return this;
    };

    @Override
    public VehicleBuilder buildWindows () {

        System.out.println("Do nothing!");

        return this;
    };

    @Override
    public Vehicle build () {

        return this.vehicle;
    };

}
