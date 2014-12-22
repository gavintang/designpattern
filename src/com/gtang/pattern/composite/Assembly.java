package com.gtang.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends AbstractItem {

	public static final Assembly NULL = new Assembly("NULL Assembly");

	public Assembly(String description) {
		items = new ArrayList<Item> ();
		this.description = description;
		this.cost = ZERO_COST;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public int getCost() {
		
		for(Item item : items) {
			cost += item.getCost();
		}
		
		return cost;
	}

	@Override
	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public Item[] getItems() {
		return items.toArray(new Item[items.size()]);
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append(description).append("[");
		
		for(int i=0; i<items.size(); i++) {
			
			Item item = items.get(i);
			if(i==0) {
				builder.append(item);
			} else {
				builder.append(",").append(item);
			}
		}
		
		builder.append("]");
		return builder.toString();
	}
	
	private static final int ZERO_COST = 0;
	private int cost;
	
	private List<Item> items;
	private String description;

}
