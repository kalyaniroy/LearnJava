package LearnJavaFromStarting;

import java.util.Scanner;

public class IfElseFor 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number");
		int num= sc.nextInt();
		
		if(num>5)
		{
			System.out.println(num+" is greater than 5");
		}
		else if (num==5)
		{
			System.out.println(num+" is equal to 5");
		}
		else
		{
			System.out.println(num+" is less than 5");
		}
		
	}

}
