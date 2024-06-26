package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message mg = createMessage();
		mg.addDefaultHeaders();
		mg.encrypt();
		return mg ;
	}
	
	//Factory Method
	public abstract Message createMessage();
}
