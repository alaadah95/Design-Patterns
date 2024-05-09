package com.myexample.mediator;

//Another Concrete Colleague
class PremiumUser extends User {

	public PremiumUser(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " receives: " + message);
	}
}
