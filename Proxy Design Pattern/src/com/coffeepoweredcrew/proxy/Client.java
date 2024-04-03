package com.coffeepoweredcrew.proxy;


public class Client {
	public static void main(String[] args) throws InterruptedException {
		Image image = ImageFactory.getImage("alaaImage.png");
		image.setLocation(new Point2D(111, 2222));
		System.out.println("Getting the cashed location before creating the Original object "+ image.getLocation());
		//Original image has been created successfully .
		image.render();
		Thread.sleep(155555550000000l);
	}

}
