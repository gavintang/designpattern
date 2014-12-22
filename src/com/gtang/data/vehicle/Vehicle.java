
package com.gtang.data.vehicle;

import com.gtang.data.common.Copyable;
import com.gtang.data.engine.Engine;

public interface Vehicle extends Copyable {

    public enum Colour {
        UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
    };

    public Engine getEngine ();
    public Vehicle.Colour getColour ();
    public void paint (Vehicle.Colour colour);
    public int getPrice();
	void cleanInterior();
	void cleanExteriorBody();
	void polishWindows();
	void takeForTestDrive();
    
}
