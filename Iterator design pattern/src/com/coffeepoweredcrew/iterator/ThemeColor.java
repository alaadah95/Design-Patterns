package com.coffeepoweredcrew.iterator;

//This enum represents the aggregate from iterator pattern
public enum ThemeColor {

	RED, ORANGE, BLACK, WHITE;

	public static ThemeColorIterator getThemeColorIterator() {
		return new ThemeColorIterator();
	}

	private static class ThemeColorIterator implements Iterator<ThemeColor> {

		private int position;

		@Override
		public boolean hasNext() {
			return position < ThemeColor.values().length;
		}

		@Override
		public ThemeColor next() {
			return ThemeColor.values()[position++];
		}

	}
	
	//Reverse Iterator
//	private static class ThemeColorIterator implements Iterator<ThemeColor> {
//
//		private int position=ThemeColor.values().length;
//
//		@Override
//		public boolean hasNext() {
//			return position != 0;
//		}
//
//		@Override
//		public ThemeColor next() {
//			return ThemeColor.values()[--position];
//		}
//
//	}
}
