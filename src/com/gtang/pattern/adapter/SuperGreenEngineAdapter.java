
package com.gtang.pattern.adapter;

import com.gtang.data.engine.AbstractEngine;
import com.gtang.data.engine.SuperGreenEngine;

public class SuperGreenEngineAdapter extends AbstractEngine {

    private SuperGreenEngine superEngine;

    public SuperGreenEngineAdapter (SuperGreenEngine superEngine) {

        super(superEngine.getEngineSize(), false);

        this.superEngine = superEngine;
    }

    @Override
    public int getSize () {

        return superEngine.getEngineSize();
    }

    @Override
    public boolean isTurbo () {

        return false;
    }

}
