package com.gtang.pattern.composite;

public class Part extends AbstractItem {
	
	public static final Part NULL = new Part("NULL Part");
	public static final int ZERO_COST = 0;
	
	public Part () {} 
	
	@Override
	public String getDescription() {
		return description; 
	}

	@Override
	public int getCost() {
		return ZERO_COST;
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(getDescription()).append(", cost=")
			.append(this.getCost()).append("]");
		return builder.toString();
	}
	
	private String description;

	private Part(String description) {
		this.description = description;
	}
	
}
