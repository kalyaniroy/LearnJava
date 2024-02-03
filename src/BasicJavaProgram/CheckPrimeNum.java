package BasicJavaProgram;

import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(stringPractice[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		int n = num/2;
		int c = 0;
		if (num==0||num==1) {
		System.out.println("Not a Prime no");
		}
		
		else
		{  for (int i=2; i<n; i++)
			{
				if (num%i==0)
				{	
				System.out.println("Not a Prime no");
				c++;
				break;
				}
			}
			if (c==0)
			{
				System.out.println("Prime no");	
			}	
				
		}
			

	}

}
