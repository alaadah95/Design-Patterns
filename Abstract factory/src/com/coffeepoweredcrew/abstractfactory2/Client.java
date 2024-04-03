package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory2.aws.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

	public static void main(String[] args) {
		ResourceFactory factory = new AwsResourceFactory();
		Instance instance = factory.createServer(Capacity.micro, 1024);
		instance.start();
		instance.stop();
		System.out.println("Goooooooooooooooooooooogle 000000000000000000000000000000");
		factory = new GoogleResourceFactory();
		instance = factory.createServer(Capacity.large, 1024);
		instance.start();
		instance.stop();

	}

}
