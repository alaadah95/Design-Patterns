package com.coffeepoweredcrew.composite;

//The component base class for composite pattern
//defines operations applicable both leaf & composite 
public abstract class File {

	private String name;

	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	public  void addFile(File file) {
		throw new UnsupportedOperationException("Adding not supported");
	};

	public  File[] getFiles() {
		return new File[] {};
	};
	
	public  boolean removeFile(File file) {
		throw new UnsupportedOperationException("Remove not supported");
	};
}
