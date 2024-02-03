package basicjavapractice;

import java.util.Scanner;

public class SumAvg {
	
	//5 no.-from user- sum-avg
	
	public void sum(int input)
	{
		int sum=0;
		
		for(int i=0; i<=4;i++)
		{
			 sum= sum+input[i];
		}
		System.out.println("Sum is "+ sum );
	}
	public void avg(int[]input)
	{
		int sum=0;
		for(int i=0; i<=4;i++)
		{
			 sum= sum+input[i];
		}
		int avg= sum/5;
		System.out.println("Avg is "+avg);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumAvg ob = new SumAvg();
		
		System.out.println("Please enter 5 no.");
		
		int []input = new int[5];
		for (int i=0; i<input.length; i++)
		{
			input[i]=sc.nextInt();
		
		}
		for (int i=0; i<input.length; i++)
		{
			ob.sum(input[i]);
		}
		
		

	}

}
