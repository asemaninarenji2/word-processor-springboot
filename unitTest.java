/*
 * Class Name:    UnitTest
 *
 * Author:        Paul
 * Creation Date: Friday, Aug 06 2021, 20:10 
 * Last Modified: Friday, Aug 06 2021, 20:25
 * 
 * Class Description: 
	This class is designed to Load the wordCount class with 
 */


import java.util.*;
public class unitTest
{
	private ArrayList<String> inputs = new ArrayList<String> ();
	
	private static String s1 ="The Blockchain is the future.";  
	private static String s2 ="You help yourself the sky will help you.";  
	private static String s3 ="A man is what he think of!";  
	private static String s4 ="The more we know the more we need to know.";  
	private static String s5 ="I live in a buble called now?>";  
	
	public unitTest()
	{
		listLoader();
	}
	
	private void listLoader()
	{
		inputs.add(s1);
		inputs.add(s2);
		inputs.add(s3);
		inputs.add(s4);
		inputs.add(s5);
	}
	public ArrayList<String> listReturn()
	{
		return inputs;
	}
	
}