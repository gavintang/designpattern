package com.gtang.data.radio;

public class ElectricWindow {
	
	public ElectricWindow () {
		open = false;
		System.out.println("Window is closed");
	}
	
	public boolean isOpen () {
		return open;
	}
	
	public boolean isClosed () {
		return !open;
	}

	public void openWndow() {
		if (isClosed()) {
			open = true;
			System.out.println("Window is now open");
		}
	}
	
	public void closeWindow() {
		if (isOpen()) {
			open = false;
			System.out.println("Window is now closed");
		}
	}
	
	private boolean open;
}
