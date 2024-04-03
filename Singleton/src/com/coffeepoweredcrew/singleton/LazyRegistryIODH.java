package com.coffeepoweredcrew.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that,
 * we have a lazy initialization without worrying about synchronization.
 */
public class LazyRegistryIODH {
	public LazyRegistryIODH() {
		System.out.println("LazyRegistryIODH intialized successfully");
	}
	private static class RegisteryHolder{
		static final LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
		
	}
	public static LazyRegistryIODH getInstance() {
		return RegisteryHolder.INSTANCE;
	}
}
