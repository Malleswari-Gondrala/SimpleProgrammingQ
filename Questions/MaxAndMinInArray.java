package Questions;

import java.util.Arrays;

// A java program which reads an Integer Array and finds out the maximum and minimum numbers
public class MaxAndMinInArray {

	public static void MaxMin(int[] input)
	{
		
		int max = input[0];
		int min = input[0];
		
		 for (int i=1; i< input.length; i++) {
			  
			  if(max < input[i])
			  {
				  max = input[i];
			  }
			  if(min > input[i])
			  {
				  min = input[i];
			  }
		  }
			
		System.out.println("The maximum number is " + max + "\nThe minimum number is " + min);
		
	}
	
	public static void MaxMinWithSort(int[] input)
	{
		Arrays.sort(input);
		System.out.println("The minimum number is " + input[0] + "\nThe maximum number is " + input[input.length-1]);
	}
}
