package com.gtang.pattern.prototype;

import com.gtang.data.vehicle.Vehicle;


public class Client {

    public static void main(String[] args) {
        
        VehicleManagerLazy manager = new VehicleManagerLazy();
        
        Vehicle saloon1 = manager.createSoloon();
        Vehicle coupe1 = manager.createCoupe();
        Vehicle sport1 = manager.createSport();
        Vehicle pickup1 = manager.createPickup();
        Vehicle boxVan1 = manager.createBoxVan();

        saloon1.paint(Vehicle.Colour.BLACK);
        coupe1.paint(Vehicle.Colour.BLACK);
        sport1.paint(Vehicle.Colour.BLACK);
        pickup1.paint(Vehicle.Colour.BLACK);
        boxVan1.paint(Vehicle.Colour.BLACK);
        
        System.out.println(saloon1);
        System.out.println(coupe1);
        System.out.println(sport1);
        System.out.println(pickup1);
        System.out.println(boxVan1);
        
        Vehicle saloon2 = manager.createSoloon();
        Vehicle coupe2 = manager.createCoupe();
        Vehicle sport2 = manager.createSport();
        Vehicle pickup2 = manager.createPickup();
        Vehicle boxVan2 = manager.createBoxVan();
        
        System.out.println(saloon2);
        System.out.println(coupe2);
        System.out.println(sport2);
        System.out.println(pickup2);
        System.out.println(boxVan2);
        
    }
}
