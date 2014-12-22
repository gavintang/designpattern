
package com.gtang.pattern.abstractfactory;

import com.gtang.data.part.Body;
import com.gtang.data.part.Chassis;
import com.gtang.data.part.Windows;

public interface VehiclePartsFactory {

    public Body createBody ();

    public Chassis createChassis ();

    public Windows createWindows ();

}
