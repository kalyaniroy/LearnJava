package LearnJavaFromStarting;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter number to check odd or even");
		int num= sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else 
		{
			System.out.println(num+" is odd number");
		}
		

	}

}
