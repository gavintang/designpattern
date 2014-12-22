package com.gtang.pattern.composite;

public interface Item {

	String getDescription();
	int getCost();
	void removeItem(Item item);
	void addItem(Item item);
	Item[] getItems();
	
}
