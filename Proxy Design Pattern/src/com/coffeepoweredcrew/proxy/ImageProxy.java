package com.coffeepoweredcrew.proxy;

//Proxy class.
public class ImageProxy implements Image {

	private Point2D location;
	private String name;
	private BitmapImage image;

	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if (image != null)
			image.setLocation(point2d);
		this.location = point2d;
	}

	@Override
	public Point2D getLocation() {
		if (image != null)
			return image.getLocation();
		return this.location;
	}

	@Override
	public void render() {
		if (image == null) {
			image = new BitmapImage(name);
			if (location != null)
				image.setLocation(location);
		}
		image.render();
	}

}
