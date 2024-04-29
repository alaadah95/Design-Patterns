package com.learning.command;

public class Main {

	public static void main(String[] args) {
		//Receiver
		TvReceiver tv = new TvReceiver();
		//Concrete Commands
		Command turnOnCommand = new TurnOnCommand(tv);
		Command turnOffCommand = new TurnOffCommand(tv);
		//Invoker
		RemoteControl remoteControl = new RemoteControl(turnOffCommand);
		remoteControl.pressOn();
		
		remoteControl = new RemoteControl(turnOnCommand);
		remoteControl.pressOn();
		
	}

}
