package com.gtang.pattern.command;

import com.gtang.data.radio.Radio;

public class VolumeUpCommand implements Command {
	
	private Radio radio;
	
	public VolumeUpCommand (Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void execute() {
		radio.volumeUp();
	}

	@Override
	public void undo() {
		radio.volumeDown();
	}

}
