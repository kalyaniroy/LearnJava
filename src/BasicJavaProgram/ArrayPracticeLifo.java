package BasicJavaProgram;

import java.util.Scanner;

public class ArrayPracticeLifo {

	public static void main(stringPractice[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please enter no.");
		
		int ar[]= new int [5];
		
		for (int i=0; i<=4; i++)
		{
			ar[i]= sc.nextInt();
		}
		
		System.out.println("Results are :");
		
		for (int k=4; k>=0; k--)
		{
			System.out.println(ar[k]);
		}

	}

}
