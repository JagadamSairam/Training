package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException{
		String path="C:/users/lenovo/desktop/data.txt";
		FileInputStream fin = new FileInputStream(path);
		FileOutputStream fout= new FileOutputStream("copiedtext.txt");
		int i;
		while((i=fin.read()) != 0)
		{
			fout.write(i);
			//System.out.print((char)i);
		}
		fin.close();
		fout.close();
	}

}
