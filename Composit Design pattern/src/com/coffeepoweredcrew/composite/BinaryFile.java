package com.coffeepoweredcrew.composite;

//Leaf node in composite pattern
public class BinaryFile extends File{

	public BinaryFile(String name) {
		super(name);
	}

	@Override
	public void ls() {
		System.out.print("b" + getName());
		
	}

	
	
}
