package BasicJavaProgram;

import java.util.Scanner;

public class Array5numSum {

	public static void main(stringPractice[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 5 number");
		
		int a[]= new int [5];

		int sum=0;
		
		
		for (int no=0; no<5; no++)
		{
			a[no]=sc.nextInt();
			
		}
		for (int no=0; no<5; no++)
		{
			sum= sum+a[no];
		}
		System.out.println("Sum is "+ sum);
		
	}

}
