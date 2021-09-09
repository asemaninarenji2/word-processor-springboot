/*
 * Class Name:    wordCount
 *
 * Author:        Paul
 * Creation Date: Friday, Aug 06 2021, 17:50 
 * Last Modified: Friday, Aug 06 2021, 20:05
 * 
 * Class Description:
		This class is a driver class for listProcessor. It loads the Strings list 
		from unitTest class.
 */


import java.io.*;
import java.util.*;
public class wordCount
 {
	public static void main(String [] args)
	{
		int wordCount =0;
		
		unitTest ut = new unitTest();
		
		ArrayList<String> input = ut.listReturn();
		
		List<String> fivePlusLength = new ArrayList<String>();
		
		listProcessor l = new listProcessor(input);
		
		
		wordCount = l.getCounts();
		fivePlusLength= l.getWords();
			
		System.out.print("the number words starting with 'm' or 'M' >>> ");
		System.out.println(wordCount + " words");
		
		System.out.println("The words with lenght of 5+ >>>");
		for ( int i =0 ; i< fivePlusLength.size();i++)
			System.out.println(fivePlusLength.get(i));
	}
}