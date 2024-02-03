package basicjavapractice;

import java.util.Scanner;

public class SimpleOdd {

	
	//user-lower limit&upper limt-print odd no. b/w both
	
	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter lower limit");
		
		int lower= sc.nextInt();
		
		System.out.println("Please enter upper limit");
		
		int upper= sc.nextInt();
		
		int sum=0;
		
		for(int i=lower;i<=upper;i++)
		{
			if (i%2!=0)
			{	
				System.out.println(i);
				sum= sum+i;
				
			}
			
			
		}
		
		System.out.println("Total sum = " +sum );
		
	}

}

