package BasicJavaProgram;

import java.util.Scanner;

public class Add3NumSwitch {
	
	public void Cal (int firstnum, int secnum, int thirdnum, int choices)
	{
	switch(choices) 
	{
	case 1:
	{
		System.out.println("Addition is :"+ (firstnum+secnum+thirdnum));
		break;
	}
	case 2:
	{
		System.out.println("Multiplication is :"+(firstnum*secnum*thirdnum));
		break;
	}
	default:
	{
	System.out.println("Invalid input");	
	}
	}
	}

	public static void main(stringPractice[] args) {
		
		Add3NumSwitch ob = new Add3NumSwitch();
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
		
		ob.Cal(firstnum,secnum,thirdnum,choice);
		
			
	}

}
