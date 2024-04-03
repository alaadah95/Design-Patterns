package com.coffeepoweredcrew.bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<String> fifoCollection = new Queue<>(new ArrayLinkedList<>());
		fifoCollection.offer("Alaa");
		fifoCollection.offer("mahmoud");
		fifoCollection.offer("daher");
		
		System.out.println(fifoCollection.size());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		
	    fifoCollection = new Queue<>(new SinglyLinkedList<>());
		fifoCollection.offer("Alaa");
		fifoCollection.offer("mahmoud");
		fifoCollection.offer("daher");
		
		System.out.println(fifoCollection.size());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		System.out.println(fifoCollection.poll());
		
	}

}
