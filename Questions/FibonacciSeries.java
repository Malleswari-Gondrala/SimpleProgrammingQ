package Questions;

public class FibonacciSeries {

	public static void fibonacci(int num) {
		System.out.println("The fibonacci series is \n0 \n 1 ");
		
		int input1 = 0;
		int input2 = 1;
		int value;
		int count =2 ;
		while (count <= num)
		{
			value = input1 + input2;
			
			input1= input2;
			input2 = value;
			System.out.println(" " + value);
			count++;
		}
		
	}
	

}
