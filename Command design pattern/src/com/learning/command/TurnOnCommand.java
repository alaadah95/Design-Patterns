package com.learning.command;

public class TurnOnCommand implements Command {

	private TvReceiver receiver;

	public TurnOnCommand(TvReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.turnOn();

	}

}
