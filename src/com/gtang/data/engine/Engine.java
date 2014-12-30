
package com.gtang.data.engine;

import com.gtang.data.diagnostic.DiagnosticTool;
import com.gtang.pattern.visitor.Visitable;

public interface Engine extends Visitable {

    public int getSize ();
    public boolean isTurbo ();
    public void diagnose (DiagnosticTool diagnosticTool);
    
    public void start();
    public void stop();
    public void increasePower();
    public void decreasePower();
    
    public static final Engine NULL = new StandardEngine(-1);
}
