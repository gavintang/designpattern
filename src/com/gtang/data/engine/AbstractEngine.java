
package com.gtang.data.engine;

import com.gtang.data.diagnostic.DiagnosticTool;
import com.gtang.pattern.visitor.Camshaft;
import com.gtang.pattern.visitor.EngineVisitor;
import com.gtang.pattern.visitor.Piston;
import com.gtang.pattern.visitor.SparkPlug;

public abstract class AbstractEngine implements Engine {

    private int size;
    private boolean turbo;
    private boolean running;
    private int power;
    
    private Camshaft camshaft;
    private Piston piston;
    private SparkPlug[] sparkPlugs;

    public AbstractEngine (int size, boolean turbo) {

        this.size = size;
        this.turbo = turbo;
        this.running = false;
        this.power = 0;
        
        camshaft = new Camshaft();
        piston = new Piston();
        sparkPlugs = new SparkPlug[] {new SparkPlug(), new SparkPlug(), new SparkPlug(), new SparkPlug()};
    }

    @Override
    public int getSize () {
        return size;
    }

    @Override
    public boolean isTurbo () {
        return turbo;
    }
    
    public void acceptEngineVisitor(EngineVisitor visitor) {
        
        camshaft.acceptEngineVisitor(visitor);
        piston.acceptEngineVisitor(visitor);
        
        for(SparkPlug aSparkPlug : sparkPlugs) {
            aSparkPlug.acceptEngineVisitor(visitor);
        }
        
        visitor.visit(this);
    }
    
    @Override
    public void diagnose (DiagnosticTool diagnosticTool) {
    	diagnosticTool.runDiagnosis(this);
    }
    
    @Override
    public void start() {
    	running = true;
    	System.out.println("Engine started");
    }
    
    @Override
    public void stop() {
    	running = false;
    	power = 0;
    	System.out.println("Engine stopped");
    }
    
    @Override
    public void increasePower() {
    	if (running && (power < 10)) {
    		power ++;
    		System.out.println("Engine power increased to " + power);
    	}
    }
    
    @Override
    public void decreasePower() {
    	if (running && (power > 0)) {
    		power --;
    		System.out.println("Engine power decreased to " + power);
    	}
    }
    
    @Override
    public String toString () {

        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName()).append(" [").append(size).append("]");
        return builder.toString();
    }

}
