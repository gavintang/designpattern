package com.gtang.pattern.command;

import com.gtang.data.radio.ElectricWindow;
import com.gtang.data.radio.Radio;

public class CommandClient {

	public static void main(String[] args) {
		
		Radio radio = new Radio ();
		radio.on();
		Command volumeUpCommand = new VolumeUpCommand (radio);
		Command volumeDownCommand = new VolumeDownCommand (radio);
		
		ElectricWindow window = new ElectricWindow();
		Command windowUpCommand = new WindowUpCommand(window);
		Command windowDownCommand = new WindowDownCommand(window);
		
		SpeechRecogniser speechRecogniser = new SpeechRecogniser (volumeUpCommand, volumeDownCommand);
		System.out.println("Speech recognition controlling the radio");
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearDownSpoken();
		
		speechRecogniser.undoLastOperation();
		speechRecogniser.undoLastOperation();
		speechRecogniser.undoLastOperation();
		speechRecogniser.undoLastOperation();
		speechRecogniser.undoLastOperation();
		speechRecogniser.undoLastOperation();
		
		speechRecogniser = new SpeechRecogniser (windowUpCommand, windowDownCommand);
		System.out.println("Speech recognition controlling the window");
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearDownSpoken();
		
	}
	
}
