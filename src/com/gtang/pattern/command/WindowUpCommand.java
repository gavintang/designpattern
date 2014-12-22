package com.gtang.pattern.command;

import com.gtang.data.radio.ElectricWindow;

public class WindowUpCommand implements Command {
	
	private ElectricWindow window;
	
	public WindowUpCommand (ElectricWindow window) {
		this.window = window;
	}
	
	@Override
	public void execute() {
		window.openWndow();
	}
	
	@Override
	public void undo() {
		window.closeWindow();
	}
}
