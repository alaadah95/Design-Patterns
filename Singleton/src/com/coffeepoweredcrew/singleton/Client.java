package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		/*Eager Singleton*/
		EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
		System.out.println(eagerRegistry1 == eagerRegistry2);
		
		/*Lazy Singleton*/
		LazyRegistryWithDCL lazyRegister1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyRegister2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazyRegister1 == lazyRegister2);
		/*Lazy Singleton with holder*/
		LazyRegistryIODH lazyHolderRegister1 = LazyRegistryIODH.getInstance(); 
		LazyRegistryIODH lazyHolderRegister2 = LazyRegistryIODH.getInstance();
		System.out.println(lazyHolderRegister1 == lazyHolderRegister2);
	}

}
