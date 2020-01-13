package com.filechar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterFileStream {
	public static void main(String[] args) throws IOException {
		FileReader input=null;
		FileWriter output=null;
		String path="C:/users/lenovo/desktop/data.txt";
		File file=new File(path);
		
		
		input = new FileReader(path);
		output=new FileWriter("C:/users/lenovo/desktop/data1.txt");
		int c;
		while((c=input.read())!=-1) {
			output.write(c);
			//System.out.print(output);
		
		}
		System.out.print("Done");
		input.close();
		output.close();
		
	}
}
