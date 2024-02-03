package basicjavapractice;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the length of the Array");
	
	int size = sc.nextInt();
	int odd=0;
	int even=0;
	
	
	int a[]= new int[size];
	
	System.out.println("Enter the "+ size +" values");
	
	for (int i=0; i<a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	
	
	for (int i=0; i<a.length; i++)
	{
		if ( a[i]%2==0)
		{
		System.out.println(a[i]+ " is even no. ");
		even++;
		
		}
		else 
		{
			System.out.println(a[i]+ " is odd no. ");
			odd++;
			
		}
	}
		System.out.println("Total even no is "+ even);
		
		System.out.println("Total odd no is "+ odd);
	}

}
