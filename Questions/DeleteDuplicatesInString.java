package Questions;

import java.util.*;


// Program to delete duplicates in a string

public class DeleteDuplicatesInString {

	/* Method uses Hash Set
	 * Declare a Hash Set
	 * Traverse each character from input
	 * Find if it is already there in Set 
	*/
	public static void DelDupUsingSet(String input)
	{
		Set<Character> output = new HashSet<>();
		StringBuilder word = new StringBuilder(input.length());
		
		for(int i=0; i<input.length();i++)
		{
			char ch= input.charAt(i);
			if(output.add(ch))
				word.append(ch);
		}
		
		System.out.println("The new string is " + word);
	}
	
	/* Method uses a for loop 
	 * To find if the string is already added to output 
	*/
	
	public static void DelDupUsingLoop(String input)
	{
		StringBuilder word = new StringBuilder(input.length());
		
		for(int i=0; i<input.length();i++)
		{
			String ch= input.substring(i, i+1);
			if(word.indexOf(ch) < 0)
				word.append(ch);
				
		}
		
		System.out.println("The new string is " + word);
	}

}
