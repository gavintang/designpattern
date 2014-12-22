
package com.gtang.pattern.factorymethod;

import com.gtang.data.vehicle.Vehicle;

public class Client {

    public static void main (String[] args) {

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECOMONICAL,
                Vehicle.Colour.WHITE);
        System.out.println(car);

        VehicleFactory vanFactory = new VanFactory();
        Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL,
                Vehicle.Colour.BLUE);
        System.out.println(van);

        Vehicle veh = VehicleFactory.make(VehicleFactory.Category.CAR,
                VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.RED);
        System.out.println(veh);

    }

}
