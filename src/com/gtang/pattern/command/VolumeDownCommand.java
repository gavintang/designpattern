package com.gtang.pattern.command;

import com.gtang.data.radio.Radio;

public class VolumeDownCommand implements Command {
	
	private Radio radio;
	
	public VolumeDownCommand (Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void execute() {
		radio.volumeDown();
	}
	
	@Override
	public void undo() {
		radio.volumeUp();
	}

}
