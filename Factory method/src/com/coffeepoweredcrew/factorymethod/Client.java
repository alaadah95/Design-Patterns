package com.coffeepoweredcrew.factorymethod;

import java.util.Collection;

import com.coffeepoweredcrew.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message mg = creator.getMessage();
		System.out.println( mg.getContent());
	}
}
