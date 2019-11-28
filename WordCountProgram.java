package assignmentThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class WordCountProgram {

	public static void main(String[] args) {
		// 	This part of the code creates the hashmap, which will help us 
		//  store the words in the text file
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		BufferedReader r = null;
		
		try {
			
			
			r = new BufferedReader(new FileReader("C:\\file.txt"));
			// This part of the program reads the first line of the
			// file and checks if its empty or not
			String currentLine = r.readLine();
			while(currentLine != null) {
				// this goes through each word, makes it lower case and
				//separates them into individual strings by checking for spaces in between
				String[] words = currentLine.toLowerCase().split(" ");
				
				for(String word : words){
					
				//	Here, the code checks if the word already exists,
				//	if it does, then it increments the value
					if(wordCountMap.containsKey(word)) {
						wordCountMap.put(word, wordCountMap.get(word)+1);
					}
					else {
						wordCountMap.put(word, 1);
					}
				}
			//reads next line
			currentLine = r.readLine();
			}
			//this makes all of the data in wordCountMap into a set
			Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet(); 
			
			//makes a list by passing the entrySet
			List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entrySet);
			
			//sorts the list from highest to lowest values
			
			Collections.sort(list, new Comparator<Entry<String, Integer>>(){
				@Override
				public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
					return (e2.getValue().compareTo(e1.getValue()));
				}
				
			});
			System.out.println("Words and how often they repeated:");
			for(Entry<String, Integer> entry : list) {
				if(entry.getValue() >  1);{
					System.out.println(entry.getValue()+ " : " + entry.getKey());
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				//closes reader
				r.close();
			}
			catch(IOException e) {
			e.printStackTrace();	
			}
		}
		
	}

}
