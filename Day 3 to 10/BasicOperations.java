package com.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Path path=fs.getPath("C:","users","lenovo","desktop");
		FileSystem f=FileSystems.getDefault();		
		Path path=Paths.get("C:","users","lenovo","desktop","javac");
//		Path fs=Files.createFile(path.resolve("sai2.txt"));

//		System.out.println("Name Count "+path.getNameCount());
//		System.out.println("Is Absolute  "+path.isAbsolute());
//		System.out.println("Name Of Index 2:  "+path.getName(2));
		
		
		
//		   Path pathDir = Paths.get("C:","filesdemo");
			Path pathFile = Paths.get("C:","users","lenovo","desktop","javac","new.txt");
//			Path pathCopy = Paths.get("C:","filesdemo","new-copy.txt");
//			Path newDir = Files.createDirectory(pathDir);
			Path newFile1 = Files.createFile(pathFile);
//			Path copy = Files.copy(pathFile, pathCopy);
		
		
		
		
		
		
	}

}
