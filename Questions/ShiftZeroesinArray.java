package Questions;

/* Logic
 * Declare a new array of same size
 * Traverse the input array, if the incoming number is not zero add it to the new array
 * Make the remaining elements 0
 */
public class ShiftZeroesinArray {

	public static void ShiftZeroesInArray(int[] input5)
	{
		int[] outputArray = new int[(input5.length)];
		int cnt=0;
		System.out.println("The elements in new Array are  ");
		
		for(int i=0; i<input5.length;i++)
		{
			if(input5[i] != 0)
			{
				outputArray[cnt] = input5[i];
			
			System.out.println(input5[i] + "\t");
			cnt++;
			}
		}
		while(cnt < input5.length)
		{
			outputArray[cnt] = 0;
			System.out.println( "0 ");
			cnt++;
		}
			
		
		
	
	}
}
