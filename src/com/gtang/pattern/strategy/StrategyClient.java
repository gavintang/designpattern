package com.gtang.pattern.strategy;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.vehicle.AbstractCar;
import com.gtang.data.vehicle.Sport;

public class StrategyClient {

    public static void main(String[] args) {
        
        AbstractCar myCar = new Sport(new StandardEngine(2000));
        myCar.setSpeed(20);
        myCar.setSpeed(40);
        
        System.out.println("Switching on sports mode gearbox ...");
        myCar.setGearboxStrategy(new SportGearboxStrategy());
        myCar.setSpeed(30);
        myCar.setSpeed(50);
        
    }
    
}
