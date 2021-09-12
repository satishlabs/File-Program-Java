package com.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E://File/test.txt");
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
