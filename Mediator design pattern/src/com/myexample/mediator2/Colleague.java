package com.myexample.mediator2;

public abstract class Colleague {
	protected Mediator mediator;
	protected String name;

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
		mediator.addColleague(this);
	}

	protected abstract void notifyMediator();
	protected abstract void receive(Colleague colleague);

	public String getName() {
		return name;
	}

	 
	
}
