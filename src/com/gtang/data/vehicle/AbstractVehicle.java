
package com.gtang.data.vehicle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.gtang.data.engine.Engine;

public abstract class AbstractVehicle implements Vehicle {

    private Engine engine;
    private Vehicle.Colour colour;

    protected AbstractVehicle (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    protected AbstractVehicle (Engine engine, Vehicle.Colour colour) {

        this.engine = engine;
        this.colour = colour;
    }

    @Override
    public Engine getEngine () {

        return this.engine;
    }

    @Override
    public Colour getColour () {

        return this.colour;
    }

    @Override
    public void paint (Vehicle.Colour colour) {

        this.colour = colour;
    }
    
    @Override
    public void cleanInterior() {
    	System.out.println("Cleaning interior");
    }
    
    @Override
    public void cleanExteriorBody() {
    	System.out.println("Cleaning exterior");
    }
    
    @Override
    public void polishWindows() {
    	System.out.println("polishing windows");
    }
    
    @Override
    public void takeForTestDrive() {
    	System.out.println("taking for test drive");
    }
    
    @Override
    public String toString () {

        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName()).append(" [").append(engine)
                .append(", ").append(colour).append("]");
        return builder.toString();
    }

    @Override
    public Object copy () {

        try {
            Constructor <? extends AbstractVehicle> constructor = getClass()
                    .getConstructor(Engine.class);
            return constructor.newInstance(this.getEngine());
        } catch (NoSuchMethodException | SecurityException e) {

            throw new IllegalStateException(String.format(
                    "Cannot find constructor %s (%s)", getClass().getSimpleName(),
                    Engine.class.getSimpleName()));
        } catch (InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {

            throw new IllegalStateException(String.format(
                    "Cannot create instance of %s (%s)", getClass().getSimpleName()));
        }
    }

}
