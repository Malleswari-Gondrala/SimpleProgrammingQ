package Questions;
import java.io.*;
import java.lang.*;
import java.util.*;

public class StringReverse {

	
	public static String reverseAString(String input)
	{
		String rev = "";
		char[] str1 = input.toCharArray();
		for(int i=str1.length-1; i>=0; i--)
		{
			rev += str1[i];
		}
						
		System.out.println("The string is " + input);
		System.out.println("The reverse string is " + rev);
		
		return rev;
	}
	

}
