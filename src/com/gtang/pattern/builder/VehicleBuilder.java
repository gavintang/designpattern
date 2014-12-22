
package com.gtang.pattern.builder;

import com.gtang.data.vehicle.Vehicle;

public interface VehicleBuilder {

    public VehicleBuilder buildChassis ();

    public VehicleBuilder buildBody ();

    public VehicleBuilder buildPassengerArea ();

    public VehicleBuilder buildBoot ();

    public VehicleBuilder buildWindows ();

    public Vehicle build ();
}
