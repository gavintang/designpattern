
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;

public class Coupe extends AbstractCar {

    public Coupe (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public Coupe (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
    }

	@Override
	public int getPrice() {
		System.out.println("Get price of Coupe, 7000.");
		return 7000;
	}

}
