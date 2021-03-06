package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {
	public static void main(String[] args) {
		 //Creating wordCountMap which holds words as keys and their occurrences as values
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		
		BufferedReader br = null;
		try {
			//Creating BufferedReader object
			br = new BufferedReader(new FileReader("E://File//Sample1.txt"));
			//Reading the first line into currentLine
			String currentLine = br.readLine();
			while(currentLine != null) {
				String[] words = currentLine.toLowerCase().split(" ");
				for(String word: words) {
					if(wordCountMap.containsKey(word)) {
						wordCountMap.put(word, wordCountMap.get(word)+1);
					}else {
						wordCountMap.put(word, 1);
					}
				}
				//Reading next line into currentLine
				currentLine = br.readLine();
				
			}
			System.out.println("Repeted Words in file: "+wordCountMap);
			//Getting the most repeated word and its occurrence
			String mostRepeatedWord = null;
			int count=0;
			Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
			for(Entry<String, Integer> entry: entrySet) {
				if(entry.getValue() > count) {
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("The most repeated word in input file is : "+mostRepeatedWord);
            
            System.out.println("Number Of Occurrences : "+count);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close(); //Closing the reader
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
