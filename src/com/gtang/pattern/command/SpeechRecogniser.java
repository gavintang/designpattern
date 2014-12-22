package com.gtang.pattern.command;

import java.util.Stack;

public class SpeechRecogniser {
	
	public SpeechRecogniser(Command upCommand, Command downCommand) {
		super();
		UpCommand = upCommand;
		DownCommand = downCommand;
		
		commands = new Stack<Command>();
	}
	
	public void setUpCommand(Command upCommand) {
		UpCommand = upCommand;
	}

	public void setDownCommand(Command downCommand) {
		DownCommand = downCommand;
	}

	public void hearUpSpoken() {
		UpCommand.execute();
		commands.push(UpCommand);
	}
	
	public void hearDownSpoken() {
		DownCommand.execute();
		commands.push(DownCommand);
	}
	
	public void undoLastOperation () {
		
		if(! commands.isEmpty()) {
			Command lastCommand = commands.pop();
			lastCommand.undo();
		}
	}
	
	private Command UpCommand;
	private Command DownCommand;
	
	private Stack <Command> commands;
	
}
