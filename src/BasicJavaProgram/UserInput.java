package BasicJavaProgram;

import java.util.Scanner;

public class UserInput {

	public void addition(int x,int y)
	{
	int z= x+y;
	System.out.println("Addition is "+z);
	}
	
	public void sub (int o, int p)
	{
		int q=o-p;
		System.out.println("Sub is "+q);
	}
	
	public void multiplication (int r, int s)
	{
		int t= r*s;
		System.out.println("multiplication is "+t);
		
	}
	public void division (int w, int x)
	{
		int y= w/x;
				System.out.println("Quotient is "+y);
		 y=w%x;
				 System.out.println("Reminder is "+y);
	}

	public static void main(stringPractice[] args) {

		
	UserInput ob = new UserInput();
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter two input");
	int A= sc.nextInt();
	int B= sc.nextInt();
	System.out.println("Enter 9 for addition, 16 for sub, 11 for multiplication, 27 for division");
	int J= sc.nextInt();
	if (J==9)
	{
		ob.addition(A, B);
	}
	else if (J==16)
	{
		ob.sub(A, B);
	}
	else if (J==11)
	{
		ob.multiplication(A, B);
	}
	else if (J==27)
	{
		ob.division(A, B);
	}
	else {
		System.out.println("Invalid input"); 
	}
	
	
	}
}


	

			
	

	
	
	
	
				
	
	
	

