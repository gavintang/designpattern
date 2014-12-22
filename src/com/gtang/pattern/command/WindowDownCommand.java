package com.gtang.pattern.command;

import com.gtang.data.radio.ElectricWindow;

public class WindowDownCommand implements Command {
	
	private ElectricWindow window;
	
	public WindowDownCommand (ElectricWindow window) {
		this.window = window;
	}
	
	@Override
	public void execute() {
		window.closeWindow();
	}
	
	@Override
	public void undo() {
		window.openWndow();
	}

}
