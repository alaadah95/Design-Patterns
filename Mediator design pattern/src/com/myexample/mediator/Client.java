package com.myexample.mediator;

public class Client {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();

		User user1 = new ChatUser(mediator, "Alice");
		User user2 = new ChatUser(mediator, "Bob");
		User user3 = new ChatUser(mediator, "Charlie");
		User user4 = new PremiumUser(mediator, "PremiumUser alaa");
	 

		user1.send("Hello, everyone!");
	}

}
