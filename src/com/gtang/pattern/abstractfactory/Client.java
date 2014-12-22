
package com.gtang.pattern.abstractfactory;

import com.gtang.data.part.Body;
import com.gtang.data.part.Chassis;
import com.gtang.data.part.Windows;

public class Client {

    private static final VehiclePartsFactory CAR_FACTORY = new CarPartsFactory();
    private static final VehiclePartsFactory VAN_FACTORY = new VanPartsFactory();

    public static void main (String[] args) {

        VehiclePartsFactory factory = createVehicleFactory("car");
        Body carBody = factory.createBody();
        Chassis carChassis = factory.createChassis();
        Windows carWindows = factory.createWindows();

        System.out.println(carBody.getBodyParts());
        System.out.println(carChassis.getChassisParts());
        System.out.println(carWindows.getWindowParts());

        System.out.println("---------------------------------------------");

        factory = createVehicleFactory("van");
        Body vanBody = factory.createBody();
        Chassis vanChassis = factory.createChassis();
        Windows vanWindows = factory.createWindows();

        System.out.println(vanBody.getBodyParts());
        System.out.println(vanChassis.getChassisParts());
        System.out.println(vanWindows.getWindowParts());

    }

    private static VehiclePartsFactory createVehicleFactory (String whatToMake) {

        if ("car".equals(whatToMake)) {
            return CAR_FACTORY;
        } else if ("van".equals(whatToMake)) {
            return VAN_FACTORY;
        } else {
            throw new IllegalStateException("Unknown Vehicle Type!");
        }

    }

}
