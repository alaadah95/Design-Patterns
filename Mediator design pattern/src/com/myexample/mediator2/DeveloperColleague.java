package com.myexample.mediator2;

public class DeveloperColleague extends Colleague {

	public DeveloperColleague(Mediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	protected void notifyMediator() {
		System.out.println(" I want to send this message to my colleague.");
		mediator.notify(this);

	}

	@Override
	protected void receive(Colleague colleague) {
		System.out.println(" I received the message from "+ colleague.getName());
	}

}
