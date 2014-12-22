package com.gtang.pattern.composite;

public class AbstractItem implements Item {

	@Override
	public String getDescription() {
		throw new UnsupportedOperationException("Unsupported getDescription()");
	}

	@Override
	public int getCost() {
		throw new UnsupportedOperationException("Unsupported getCost()");
	}

	@Override
	public void addItem(Item item) {
		throw new UnsupportedOperationException("Unsupported addItem()");
	}

	@Override
	public void removeItem(Item item) {
		throw new UnsupportedOperationException("Unsupported removeItem()");
	}

	@Override
	public Item[] getItems() {
		throw new UnsupportedOperationException("Unsupported getItems()");
	}

}
