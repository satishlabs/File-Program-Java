package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 
Program to Sort all contents of file by line in java

Let’s say c:/myFile.txt looks like this >
you are 
learning file 
io from 
javaMadeSoEasy a

Write a Program to Sort all contents of file by line and write it back in file in java, such that after execution of program file must look like this -

io from 
javaMadeSoEasy a
learning file 
you are 

 * */

public class SortContentsByLinesInFile {
	public static void main(String[] args) throws IOException {
		String fileName = "E://File//Sample1.txt";
		String fileName2 = "E://File//Sample2.txt";
		try {
			 //1) Read file in String, and store each String in ArrayList
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			List<String> list = new ArrayList<>();
			String str;
			
			while((str = br.readLine()) != null) {
				list.add(str);
			}
			br.close();
			 //By now, String fileDataInString contains all the data of file
			//2) Sort ArrayList
			Collections.sort(list);
			 //Display sorted list
			System.out.println(list);
			
			//3) Now, write sorted content in file
			FileWriter fw = new FileWriter(fileName2);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String st: list) {
				bw.write(st);
				bw.write("\n");
			}
			bw.close();
			System.out.println("\nSorted content has been written in file");
		}catch (FileNotFoundException  e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
