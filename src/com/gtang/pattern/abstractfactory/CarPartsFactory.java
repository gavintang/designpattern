
package com.gtang.pattern.abstractfactory;

import com.gtang.data.part.Body;
import com.gtang.data.part.CarBody;
import com.gtang.data.part.CarChassis;
import com.gtang.data.part.CarWindows;
import com.gtang.data.part.Chassis;
import com.gtang.data.part.Windows;

public class CarPartsFactory implements VehiclePartsFactory {

    @Override
    public Body createBody () {

        return new CarBody();
    }

    @Override
    public Chassis createChassis () {

        return new CarChassis();
    }

    @Override
    public Windows createWindows () {

        return new CarWindows();
    }

}
