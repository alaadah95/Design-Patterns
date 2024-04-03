package com.coffeepoweredcrew.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

	private BlockingQueue<T> queue;

	public ObjectPool(Supplier<T> supplier, int numberOfPoolSize) {
		queue = new LinkedBlockingQueue<>();
		for (int i = 0; i < numberOfPoolSize; i++) {
			queue.offer(supplier.get());
		}
	}

	public T get() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public void release(T object) {
		object.reset();
		try {
			queue.put(object);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
