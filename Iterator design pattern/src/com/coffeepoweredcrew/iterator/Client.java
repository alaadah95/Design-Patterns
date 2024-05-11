package com.coffeepoweredcrew.iterator;

public class Client {

	public static void main(String[] args) {
		Iterator<ThemeColor> colors = ThemeColor.getThemeColorIterator();
		while(colors.hasNext()) {
			System.out.println(colors.next());
		}
	}

}
