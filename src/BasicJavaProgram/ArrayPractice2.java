package BasicJavaProgram;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(stringPractice[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter no.");
		
		//input
		
		int array[]= new int [6];
		for (int i=0; i<=5; i++)
		{
		array [i]= sc.nextInt();
		}
		
		//result
		
		System.out.println("Elements are :");
		for (int i=0; i<=5; i++)
		{
			System.out.println(array [i]);
		}

	}

}
