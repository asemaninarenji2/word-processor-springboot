/*
 * Class Name:    listProcessor
 *
 * Author:        Paul
 * Creation Date: Friday, Aug 06 2021, 17:50 
 * Last Modified: Friday, Aug 06 2021, 19:55
 * 
 * Class Description:
		This class receives a list of Strings, devides the list into seperate Strings,
		splits the strings into words, then it trims the words. When the word is ready
		it identifies if the word starts with 'm' or 'M'. If so it counts the word.
		Then it identifies the length of the word. IF equal or greater then 5, it records
		the word.
 */



import java.io.*;
import java.util.*;
import java.lang.*;
public class listProcessor
 {
	private ArrayList<String> input ;
	private ArrayList<String> fivePlusLength = new ArrayList<String>();
	private int wordCount;
	
	//THE CONSTRACTOR: It initiates the input OBJ and
	// starts processing by calling the processor method
	public listProcessor(ArrayList<String> input )
	{
		this.input= input;
		processor();
	}
	
	
	//This method does all the word processing related to the task	
	private void processor()
	{
		String tempStr = new String();
		String[] words;
		
			for( int i=0; i< input.size();i++)
			{
				tempStr= input.get(i);
				
				words= tempStr.split("\\s"); 
				
				for (String word: words)
				{
					word = word.replaceAll("[^a-zA-Z0-9]", " ").trim(); //to remove all special chars and to trim it too
					
					if (word.charAt(0) == 'M' || word.charAt(0) == 'm')
					{
						wordCount++;
					}
					if (word.length()>=5)
					{
						fivePlusLength.add(word);
					}
				}
				
			}
		
	}

	
	public int getCounts()
	{
		return wordCount;
	}
		
	public ArrayList<String> getWords()
	{
		return fivePlusLength;
	}		
		
		
	
	
	
 }