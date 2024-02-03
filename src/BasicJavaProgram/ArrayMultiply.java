package BasicJavaProgram;

import java.util.Scanner;

public class ArrayMultiply {

	public static void main(stringPractice[] args) {
		
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Please enter no.");
	
	int product = 1;
	
	int a[] = new int[5];
	for (int i=0; i<=4; i++)
	{a[i] = sc.nextInt();}
	
	
		for (int i=0; i<=4; i++)
		
	{	product = product*a[i];	
		
	}
		System.out.println("Product is "+product);
			
	 		 
			 
	
	
	
	}
}