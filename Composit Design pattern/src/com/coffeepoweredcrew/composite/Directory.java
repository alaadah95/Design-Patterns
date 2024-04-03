package com.coffeepoweredcrew.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File {

	private List<File> files = new ArrayList<>();
	
	public Directory(String name) {
		super(name);
	}

	@Override
	public void ls() {
		System.out.println(getName());
		printFilesRecursively(getFiles());
	}

	private void printFilesRecursively( File[] files ) {
		if(files.length == 0 )
			return ;
		
		for (File file : files) {
			
			System.out.println( file.getName());
			printFilesRecursively(file.getFiles().length == 0 ?  new File[] {} : file.getFiles() );
		}
	}
	
	@Override
	public void addFile(File file) {
		files.add(file);
	}

	@Override
	public File[] getFiles() {
		 
		return  files.toArray(new File[files.size()]);
	}

	@Override
	public boolean removeFile(File file) {
		 
		return files.remove(file);
	}
	
	
}
