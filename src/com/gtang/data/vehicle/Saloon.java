
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;

public class Saloon extends AbstractCar {

    public Saloon (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public Saloon (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
    }

	@Override
	public int getPrice() {
		return 5000;
	}

}
