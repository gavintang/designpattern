package com.gtang.pattern.interpreter;

public class City {
	
	public City(String name, double latitude, double longitude) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getName() {
		return name;
	}
	public double getLatitude() {
		return latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	
	@Override
	public boolean equals (Object otherObj) {
		if (this == otherObj) return true;
		if (!(otherObj instanceof City)) return false;
		
		City otherCity = (City) otherObj;
		return getName().equals(otherCity.getName());
	}
	
	@Override
	public int hashCode() {
		return getName().hashCode();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [name=").append(name).append(", latitude=")
				.append(latitude).append(", longitude=").append(longitude)
				.append("]");
		return builder.toString();
	}

	private String name;
	private double latitude, longitude;
	
}
