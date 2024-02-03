package BasicJavaProgram;

import java.util.Scanner;

public class SwitchAdd3NumS {
	
	public int Cal (int firstnum, int secnum, int thirdnum, int choices)
	{
		int result=0;	
		
	switch(choices) 
	{
	case 1:
	{
		result= firstnum+secnum+thirdnum;
		return result;
	}
	case 2:
	{
		result = firstnum*secnum*thirdnum;
		return result;
	}
	default:
	{
		return result;
	}
	}
	}

	public static void main(stringPractice[] args) {
		
		SwitchAdd3NumS ob = new SwitchAdd3NumS();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Please enter number");
		
		System.out.println("Enter first number");
		int firstnum = sc.nextInt();
		
		System.out.println("Enter second number");
		int secnum = sc.nextInt();
		
		System.out.println("Enter third number");
		int thirdnum = sc.nextInt();
		
		System.out.println("Enter 1 for addition, Enter 2 for multiplication");
		int choice = sc.nextInt();
		
		int result = ob.Cal(firstnum,secnum,thirdnum,choice);
		
		System.out.println("Result is "+ result );
		
			
	}

}

