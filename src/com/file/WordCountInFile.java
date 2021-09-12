package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {
	public static void main(String[] args) {
		BufferedReader br = null;
        
        //Initializing charCount, wordCount and lineCount to 0
         
        int charCount = 0;
         
        int wordCount = 0;
         
        int lineCount = 0;
        try {
        	br = new BufferedReader(new FileReader("E://File//Sample1.txt"));
        	 //Reading the first line into currentLine
        	String currentLine = br.readLine();
        	while(currentLine != null) {
        		//Updating the lineCount
        		lineCount++;
        		//Getting number of words in currentLine
        		String[] words = currentLine.split(" ");
        		
        		 //Updating the wordCount
        		wordCount = wordCount+words.length;
        		
        		for(String word : words) {
        			charCount = charCount+word.length();
        		}
        		
        		//Reading next line into currentLine
        		currentLine = br.readLine();
        	}
        	//Printing charCount, wordCount and lineCount
            
            System.out.println("Number Of Chars In A File : "+charCount);
             
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);
        }catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
