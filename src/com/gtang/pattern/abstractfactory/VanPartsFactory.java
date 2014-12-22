
package com.gtang.pattern.abstractfactory;

import com.gtang.data.part.Body;
import com.gtang.data.part.Chassis;
import com.gtang.data.part.VanBody;
import com.gtang.data.part.VanChassis;
import com.gtang.data.part.VanWindows;
import com.gtang.data.part.Windows;

public class VanPartsFactory implements VehiclePartsFactory {

    @Override
    public Body createBody () {

        return new VanBody();
    }

    @Override
    public Chassis createChassis () {

        return new VanChassis();
    }

    @Override
    public Windows createWindows () {

        return new VanWindows();
    }

}
