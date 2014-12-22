package com.gtang.data.engine;


public class SuperGreenEngine {

    private int engineSize;
    
    public SuperGreenEngine (int engineSize) {
        this.engineSize = engineSize;
    }
    
    public int getEngineSize () {
        return engineSize;
    }
    
    @Override
    public String toString () {

        StringBuilder builder = new StringBuilder();
        builder.append("SUPER ENGINE ").append(engineSize);
        return builder.toString();
    }

}
