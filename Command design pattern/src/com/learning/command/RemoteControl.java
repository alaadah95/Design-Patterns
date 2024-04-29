package com.learning.command;

//Invoker
public class RemoteControl  {
	private Command command;

	public RemoteControl(Command command) {
		this.command = command;
	}
	
	public void pressOn() {
		command.execute();
	}
}
