package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.Instance.Capacity;

//Abstract factory with methods defined for each object type.
public interface  ResourceFactory {
	
	public Instance createInstance(Capacity capacity);
	public Storage createStorage(int capacityInMib);
	
	public default Instance createServer(Capacity capacity,int capacityInMib) {
		Storage storage = createStorage(capacityInMib);
		Instance instance = createInstance(capacity);
		instance.attachStorage(storage);
		return instance;
	}
	
}
