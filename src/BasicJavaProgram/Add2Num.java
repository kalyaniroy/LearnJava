package BasicJavaProgram;

import java.util.Scanner;

public class Add2Num {
    
	public static void main(stringPractice[] args) {
		Add2Num ob = new Add2Num ();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please Enter Number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter 1 for addition, Enter 2 for multiplication");
		int k = sc.nextInt();
		
		if (k==1)
		{	int sum = ob.addition(a, b);
		System.out.println("Addition is :"+sum);
		
		}
		else if (k==2)
		{	int sum = ob.multiplication(a, b);
			ob.multiplication(a, b);
		}
		else 
		{
			System.out.println("Invalid input");
		}
		
	}
	
	public int addition(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public int multiplication (int a, int b)
	{
		int c = a*b;
		return c;
	}
	
	
	
	
	
}
