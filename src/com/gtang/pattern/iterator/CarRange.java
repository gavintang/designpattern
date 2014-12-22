package com.gtang.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.gtang.data.engine.StandardEngine;
import com.gtang.data.vehicle.AbstractCar;
import com.gtang.data.vehicle.Coupe;
import com.gtang.data.vehicle.Saloon;
import com.gtang.data.vehicle.Sport;

public class CarRange implements Iterable <AbstractCar> {
	
	private List <AbstractCar> cars;
	
	public CarRange () {
		cars = new ArrayList<AbstractCar> ();
		
		cars.add(new Coupe(new StandardEngine(800)));
		cars.add(new Coupe(new StandardEngine(900)));
		cars.add(new Saloon(new StandardEngine(1000)));
		cars.add(new Saloon(new StandardEngine(1100)));
		cars.add(new Sport(new StandardEngine(1200)));
	}

	@Override
	public Iterator<AbstractCar> iterator() {
		return cars.iterator();
	}
	
}
