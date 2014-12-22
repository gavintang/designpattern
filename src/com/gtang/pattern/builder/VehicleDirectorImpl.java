
package com.gtang.pattern.builder;

import com.gtang.data.vehicle.Vehicle;

public class VehicleDirectorImpl implements VehicleDirector {

    private VehicleBuilder builder;
    
    public VehicleDirectorImpl (VehicleBuilder builder) {
        this.builder = builder;
    }
    
    @Override
    public Vehicle build () {

        if (builder != null) {
            return builder.buildChassis().buildBody().buildPassengerArea().buildBoot()
                    .buildWindows().build();
        } else {
            return null;
        }

    }

}
