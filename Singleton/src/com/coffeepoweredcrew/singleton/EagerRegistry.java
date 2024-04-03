package com.coffeepoweredcrew.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
	
	private static EagerRegistry INSTANACE = new EagerRegistry();
	
	private EagerRegistry() {
		
	}
	
	public static EagerRegistry getInstance() {
		return INSTANACE;
	}
	
}