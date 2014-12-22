package com.gtang.pattern.iterator;

import com.gtang.data.vehicle.AbstractCar;

public class IteratorClient {

	public static void main(String[] args) {
		
		CarRange range = new CarRange();
		
		for(AbstractCar  car : range) {
			System.out.println(car);
		}
		
	}

}
