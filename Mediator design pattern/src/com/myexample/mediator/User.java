package com.myexample.mediator;

//Colleague Interface
abstract class User {
	protected ChatMediator mediator;
	protected String name;

	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
		mediator.addUser(this);
	}

	public abstract void send(String message);

	public abstract void receive(String message);
}