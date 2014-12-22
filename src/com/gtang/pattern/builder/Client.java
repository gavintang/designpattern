
package com.gtang.pattern.builder;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.engine.TurboEngine;
import com.gtang.data.vehicle.BoxVan;
import com.gtang.data.vehicle.Saloon;
import com.gtang.data.vehicle.Vehicle;

public class Client {

    public static void main (String[] args) {

        Saloon car = new Saloon(new StandardEngine(1300));
        VehicleBuilder builder = new CarBuilder(car);
        VehicleDirector director = new VehicleDirectorImpl(builder);
        Vehicle vehicle = director.build();
        System.out.println(vehicle);

        builder = null;
        director = null;
        vehicle = null;
        
        System.out.println("------------------------------------------");

        BoxVan van = new BoxVan(new TurboEngine(1300));
        builder = new VanBuilder(van);
        director = new VehicleDirectorImpl(builder);
        vehicle = director.build();
        System.out.println(vehicle);

    }

}
