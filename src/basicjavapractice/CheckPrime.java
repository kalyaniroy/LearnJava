package basicjavapractice;

import java.util.Scanner;

public class CheckPrime {
	
	public void getPrime(int num[]) {
		int c=0;
		for (int j = 0; j < num.length; j++) {
			if (num[j] == 0 || num[j] == 1) {
				System.out.println(num + " is not a prime number");
			} else {
				for (int i = 2; i < num[j]/2; i++) {
					if (num[j] % i == 0) {
					c++;
					}
				}
				
				if(c==0)
				System.out.println(num[j]+ " is a Prime");
				
				else
				System.out.println(num[j]+ " is not a prime number");
					
			}

		}
	}

	public static void main(String[] args)
	{	
		Scanner sc = new Scanner (System.in);
		CheckPrime ob = new CheckPrime();
		
		System.out.println("Please enter 5 numbers");
		
		int []a = new int [5];
		
		for (int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		ob.getPrime(a);
		
			
	}

}
