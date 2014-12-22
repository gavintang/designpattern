
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;

public class BoxVan extends AbstractVan {

    public BoxVan (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public BoxVan (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
    }

	@Override
	public int getPrice() {
		return 10000;
	}

}
