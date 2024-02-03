package BasicJavaProgram;

import java.util.Scanner;

public class Arraysum {

	public static void main(stringPractice[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter no.");
		
		int sum=0;
		
		int a[] = new int[5];
		for (int i=0; i<=4; i++)
		{
			a[i]= sc.nextInt();
		}
		
		for (int i=0; i<=4; i++)
		{
			sum = sum + a[i];
			
		}
		System.out.println("Sum = "+ sum);
		
		
		
		
	}

}
