package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileCopyInAnother {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("E://File//F1.txt");
			//FileWriter fw =new FileWriter("E://File//F2.txt");
			
			String str="";
			File file = new File("E://File//F2.txt"); //initialize File object and passing path as argument  
			boolean result;  
		  
			result = file.createNewFile();  //creates a new file
			
			FileWriter fw = new FileWriter(file.getCanonicalFile());
			
			int i=0;
			while((i = fr.read())!= -1 ) {
				str+= (char)i;
			}
			System.out.println(str);
			
			fw.write(str);
			
			fr.close();
			fw.close();
			
			System.out.println("File Reading and writing both done");
		}catch (Exception e) {
			System.out.println("There are some exception : "+e);
		}
	}
}
