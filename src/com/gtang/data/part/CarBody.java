
package com.gtang.data.part;

import com.gtang.pattern.composite.Part;

public class CarBody extends Part implements Body {

    @Override
    public String getBodyParts () {

        return "Body shell parts for a car";
    }
    
	@Override
	public String getDescription() {
		return "Body shell part"; 
	}
	
	@Override
	public int getCost() {
		return 1;
	}

}
