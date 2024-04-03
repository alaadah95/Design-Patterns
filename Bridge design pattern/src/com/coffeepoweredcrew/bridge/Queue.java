package com.coffeepoweredcrew.bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{

	
	LinkedList<T> linkedList  ;
	
	public Queue(LinkedList<T> element) {
		this.linkedList = element;
	}
	
	@Override
	public void offer(T element) {
		linkedList.addLast(element);
	}

	@Override
	public T poll() {
		return linkedList.removeFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return linkedList.getSize();
	}
	
	
}
