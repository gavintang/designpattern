
package com.gtang.pattern.factorymethod;

import com.gtang.data.vehicle.Vehicle;

public abstract class VehicleFactory {

    public enum DrivingStyle {ECOMONICAL, MIDRANGE, POWERFUL};
    public enum Category {CAR, VAN};
    
    private final static VehicleFactory CAR_FACTORY = new CarFactory();
    private final static VehicleFactory VAN_FACTORY = new VanFactory();
    
    //static factory method
    public static Vehicle make (Category category, DrivingStyle style, Vehicle.Colour colour) {
        
        VehicleFactory factory = null;
        
        switch (category) {
            
            case CAR:
                factory = CAR_FACTORY;
                break;
            case VAN:
                factory = VAN_FACTORY;
                break;
            default:
                throw new IllegalStateException("Unsupported Category!");
        }
        
        return factory.build(style, colour);
        
    }
    
    public Vehicle build (DrivingStyle style, Vehicle.Colour colour) {
        
        Vehicle veh = this.selectVehicle(style);
        veh.paint(colour);
        
        return veh;
    }

    protected abstract Vehicle selectVehicle (DrivingStyle style); // This is factory method
    
}
