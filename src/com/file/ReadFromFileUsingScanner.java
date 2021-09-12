package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileUsingScanner {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E://File/test.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}
