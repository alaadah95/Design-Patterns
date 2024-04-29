package com.learning.command;

public class TurnOffCommand implements Command {

	private TvReceiver receiver;

	public TurnOffCommand(TvReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.turnOff();

	}

}
