package com.coffeepoweredcrew.composite;

public class Client {
	
	
	public static void main(String[] args) {
		// it can work as normal object .
		File file1 = new BinaryFile("file1");
		File file2 = new BinaryFile("file2");
		File file3 = new BinaryFile("file3");
		
		//it can work with tree structure also
		File Directory = new Directory("Dir1");
		Directory.addFile(file1);
		Directory.addFile(file2);
		Directory.addFile(file3);
		
		File Directory2 = new Directory("Dir2");
		Directory2.addFile(file1);
		Directory2.addFile(file2);
		
		
		Directory.addFile(Directory2);
		Directory.ls();
	}
	
}
